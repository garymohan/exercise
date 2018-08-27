package uk.co.whitbread.exercise.providers.ipstatck;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import uk.co.whitbread.exercise.providers.ipstack.response.IPStackResponse;

@Component
@Slf4j
public class IPStackProvider {

  private static final String IP_PARAM = "ip";
  private static final String ACCESS_KEY_PARAM = "access_key";


  private String baseUrl;
  private String access_key;
  private RestTemplate restTemplate;

  public IPStackProvider(@Value("${providers.ipstack.baseUrl}") String baseUrl,
      @Value("${providers.ipstack.access_key}") String access_key,
      RestTemplate restTemplate) {
    this.baseUrl = baseUrl;
    this.access_key = access_key;
    this.restTemplate = restTemplate;
  }

  public IPStackResponse getIPStackRespomse(String ip) {
    log.info("getIPStackRespomse:: ip:{}, latitude:{}, placeName:{}", ip);
    Map<String, String> params = new ConcurrentHashMap<>();
    params.put(IP_PARAM, ip);
    params.put(ACCESS_KEY_PARAM, access_key);
    ResponseEntity<IPStackResponse> response = restTemplate
        .exchange(baseUrl, HttpMethod.GET, null, IPStackResponse.class, params);

    if (response != null && response.getStatusCode() == HttpStatus.OK) {
      return response.getBody();
    } else {
      log.error("getFoursquareResponse error:: {}", response);
      return null;
    }

  }

}
