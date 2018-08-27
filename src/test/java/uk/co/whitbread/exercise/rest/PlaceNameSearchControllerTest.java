package uk.co.whitbread.exercise.rest;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlEqualTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static uk.co.whitbread.exercise.providers.Util.getPayload;


import com.github.tomakehurst.wiremock.junit.WireMockRule;
import java.io.IOException;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import uk.co.whitbread.exercise.ExerciseApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PlaceNameSearchControllerTest {

  private static final String IPSTACK_RESPONSE = "/jsonResponses/IPStackResponse.json";
  private static final String FOURSQUARE_SEARCH_RESPONSE = "/jsonResponses/FoursquareSearchResponse.json";
  private static final String FOURSQUARE_EXPLORE_RESPONSE = "/jsonResponses/FoursquareExploreResponse.json";
  private static final String ENDPOINT_RESULT = "/jsonResponses/EndpointResult.json";

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8081);

  @Autowired
  WebApplicationContext context;

  private MockMvc mvc;

  @Before
  public void initTests() throws IOException {
    mvc = MockMvcBuilders.webAppContextSetup(context).build();

    String expectedUrl1 = "/127.0.0.1?access_key=b19908012b13dc5555e7779d0d0dd98f";
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

  }


  @Test
  public void getPlaceNameSearch() throws Exception {

    // In the line below, MockMvcResultMatchers.content().json(getPayload(ENDPOINT_RESULT)) makes a
    // JSON comparison with the expected result in test/resources/jsonResponses/EndpointResult.json
    // This avoids needing to clutter the test with loads of assertion lines.

    mvc.perform(MockMvcRequestBuilders.get("/placenamesearch/starbucks").accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk()).andExpect(MockMvcResultMatchers.content().json(getPayload(ENDPOINT_RESULT))).andReturn();

  }
}