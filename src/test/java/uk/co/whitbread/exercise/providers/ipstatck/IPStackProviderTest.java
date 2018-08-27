package uk.co.whitbread.exercise.providers.ipstatck;

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
import uk.co.whitbread.exercise.providers.ipstack.response.IPStackResponse;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IPStackProviderTest {

  private static final String IPSTACK_RESPONSE = "/jsonResponses/IPStackResponse.json";

  @Rule
  public WireMockRule wireMockRule = new WireMockRule(8081);

  @Autowired
  private IPStackProvider ipStackProvider;

  @Autowired
  private Gson gson;

  @Test
  public void testIPStackRespomse() throws IOException {

    String expectedUrl = "/82.153.127.14?access_key=b19908012b13dc5555e7779d0d0dd98f";
    stubFor(get(urlEqualTo(expectedUrl))
        .willReturn(aResponse()
            .withStatus(200)
            .withHeader("Content-Type", "application/json")
            .withBody(getPayload(IPSTACK_RESPONSE))));
    IPStackResponse response = ipStackProvider.getIPStackRespomse("82.153.127.14");

    IPStackResponse expected = gson.fromJson(getPayload(IPSTACK_RESPONSE), IPStackResponse.class);

    assertEquals(expected, response);
  }
}