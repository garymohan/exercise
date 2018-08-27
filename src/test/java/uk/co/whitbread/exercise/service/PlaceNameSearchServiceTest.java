package uk.co.whitbread.exercise.service;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.Assert.*;
import static uk.co.whitbread.exercise.providers.Util.getPayload;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.List;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.whitbread.exercise.providers.foursquare.response.Venue;
import uk.co.whitbread.exercise.providers.ipstack.response.IPStackResponse;
import uk.co.whitbread.exercise.rest.response.PlaceNameSearchResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaceNameSearchServiceTest {

  private static final String IPSTACK_RESPONSE = "/jsonResponses/IPStackResponse.json";
  private static final String FOURSQUARE_SEARCH_RESPONSE = "/jsonResponses/FoursquareSearchResponse.json";
  private static final String FOURSQUARE_EXPLORE_RESPONSE = "/jsonResponses/FoursquareExploreResponse.json";
  private static final String ENDPOINT_RESULT = "/jsonResponses/EndpointResult.json";


  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8081);

  @Autowired
  private PlaceNameSearchService placeNameSearchService;

  @Autowired
  private Gson gson;



  @Test
  public void getRecommendedPlacesNearNamedVenue() throws IOException {

    String expectedUrl1 = "/82.153.127.14?access_key=b19908012b13dc5555e7779d0d0dd98f";
    stubFor(get(urlEqualTo(expectedUrl1))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(getPayload(IPSTACK_RESPONSE))));

    String expectedUrl2 = "/v2/venues/search?ll=51.4964,-0.1224&query=starbucks&limit=1&llAcc=1&client_id=GPFTFN1EMZM25VDEULQUG0JJOTV2MQB4HGCPSFSTFL2QX3WG&client_secret=YFTOZUGFSOFB1W241QEK2D43NE0ZKJDWZDD0111Z4RRFXZNA&v=20180826";

    stubFor(get(urlEqualTo(expectedUrl2))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(getPayload(FOURSQUARE_SEARCH_RESPONSE))));

    String expectedUrl3 = "/v2/venues/explore?ll=51.514401,-0.151777&client_id=GPFTFN1EMZM25VDEULQUG0JJOTV2MQB4HGCPSFSTFL2QX3WG&client_secret=YFTOZUGFSOFB1W241QEK2D43NE0ZKJDWZDD0111Z4RRFXZNA&v=20180826";
    stubFor(get(urlEqualTo(expectedUrl3))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(getPayload(FOURSQUARE_EXPLORE_RESPONSE))));

    List<Venue> response = placeNameSearchService.getRecommendedPlacesNearNamedVenue("82.153.127.14", "starbucks");

    PlaceNameSearchResponse expected = gson.fromJson(getPayload(ENDPOINT_RESULT), PlaceNameSearchResponse.class);

    assertEquals(expected.getVenue().size(), response.size());
    assertEquals(expected.getVenue(), response);
  }
}