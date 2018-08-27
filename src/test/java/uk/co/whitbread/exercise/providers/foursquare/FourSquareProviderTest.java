package uk.co.whitbread.exercise.providers.foursquare;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.junit.Assert.*;
import static uk.co.whitbread.exercise.providers.Util.getPayload;

import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.google.gson.Gson;
import java.io.IOException;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import uk.co.whitbread.exercise.providers.foursquare.response.FoursquareExploreResponse;
import uk.co.whitbread.exercise.providers.foursquare.response.FoursquareSearchResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FourSquareProviderTest {

  private static final String FOURSQUARE_SEARCH_RESPONSE = "/jsonResponses/FoursquareSearchResponse.json";
  private static final String FOURSQUARE_EXPLORE_RESPONSE = "/jsonResponses/FoursquareExploreResponse.json";

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8081);

  @Autowired
  FourSquareProvider fourSquareProvider;

  @Autowired
  private Gson gson;

  @Test
  public void testSearchResponse() throws IOException {
    String expectedUrl = "/v2/venues/search?ll=51.4964,-0.1224&query=starbucks&limit=1&llAcc=1&client_id=GPFTFN1EMZM25VDEULQUG0JJOTV2MQB4HGCPSFSTFL2QX3WG&client_secret=YFTOZUGFSOFB1W241QEK2D43NE0ZKJDWZDD0111Z4RRFXZNA&v=20180826";
    stubFor(get(urlEqualTo(expectedUrl))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(getPayload(FOURSQUARE_SEARCH_RESPONSE))));

    FoursquareSearchResponse response = fourSquareProvider.getPlaceNameFoursquareResponse("51.4964","-0.1224", "starbucks");

    FoursquareSearchResponse expected = gson.fromJson(getPayload(FOURSQUARE_SEARCH_RESPONSE), FoursquareSearchResponse.class);

    assertEquals(expected, response);
  }

  @Test
  public void testExploreResponse() throws IOException {
    String expectedUrl = "/v2/venues/explore?ll=51.4964,-0.1224&client_id=GPFTFN1EMZM25VDEULQUG0JJOTV2MQB4HGCPSFSTFL2QX3WG&client_secret=YFTOZUGFSOFB1W241QEK2D43NE0ZKJDWZDD0111Z4RRFXZNA&v=20180826";
    stubFor(get(urlEqualTo(expectedUrl))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(getPayload(FOURSQUARE_EXPLORE_RESPONSE))));

    FoursquareExploreResponse response = fourSquareProvider.getExploreFoursquareResponse("51.4964","-0.1224");

    FoursquareExploreResponse expected = gson.fromJson(getPayload(FOURSQUARE_EXPLORE_RESPONSE), FoursquareExploreResponse.class);

    assertEquals(expected, response);
  }



}