package uk.co.whitbread.exercise.providers.foursquare;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Component;
import com.google.gson.Gson;
import org.springframework.web.client.RestTemplate;
import uk.co.whitbread.exercise.providers.foursquare.response.FoursquareExploreResponse;
import uk.co.whitbread.exercise.providers.foursquare.response.FoursquareSearchResponse;
import lombok.extern.slf4j.Slf4j;


@Component
@Slf4j
public class FourSquareProvider {

  private static final String LL_PARAM = "ll";
  private static final String QUERY_PARAM = "query";
  private static final String LIMIT_PARAM = "limit";
  private static final String LILACC_PARAM = "llAcc";
  private static final String CLIENT_ID_PARAM = "client_id";
  private static final String CLIENT_SECRET_PARAM = "client_secret";
  private static final String VERSION_PARAM = "v";

  private String baseUrlSearch;
  private String baseUrlExplore;
  private String limit;
  private String llAcc;
  private String client_id;
  private String client_secret;
  private String version;
  private RestTemplate restTemplate;

  public FourSquareProvider(@Value("${providers.foursquare.baseUrlSearch}") String baseUrlSearch,
      @Value("${providers.foursquare.baseUrlExplore}") String baseUrlExplore,
      @Value("${providers.foursquare.limit}") String limit,
      @Value("${providers.foursquare.llAcc}") String llAcc,
      @Value("${providers.foursquare.client_id}") String client_id,
      @Value("${providers.foursquare.client_secret}") String client_secret,
      @Value("${providers.foursquare.version}") String version,
      RestTemplate restTemplate) {
    this.baseUrlSearch = baseUrlSearch;
    this.baseUrlExplore = baseUrlExplore;
    this.limit = limit;
    this.llAcc = llAcc;
    this.client_id = client_id;
    this.client_secret = client_secret;
    this.version = version;
    this.restTemplate = restTemplate;
  }

  public FoursquareSearchResponse getPlaceNameFoursquareResponse(String latitude, String longitude,
      String placeName) {
    log.info("getFoursquareResponse:: longitude:{}, latitude:{}, placeName:{}", longitude, latitude,
        placeName);
    Map<String, String> params = new ConcurrentHashMap<>();
    params.put(LL_PARAM, String.format("%s,%s", latitude, longitude));
    params.put(QUERY_PARAM, placeName);

    //The limits are here to limit the response to one result, as close as possible to the user's longitude and latitude.
    params.put(LIMIT_PARAM, limit);
    params.put(LILACC_PARAM, llAcc);

    params.put(CLIENT_ID_PARAM, client_id);
    params.put(CLIENT_SECRET_PARAM, client_secret);
    params.put(VERSION_PARAM, version);
    ResponseEntity<FoursquareSearchResponse> response = restTemplate
        .exchange(baseUrlSearch, HttpMethod.GET, null, FoursquareSearchResponse.class, params);

    if (response != null && response.getStatusCode() == HttpStatus.OK) {
      return response.getBody();
    } else {
      log.error("getFoursquareResponse error:: {}", response);
      return null;
    }

  }

  public FoursquareExploreResponse getExploreFoursquareResponse(String latitude, String longitude) {
    log.info("getExploreFoursquareResponse:: longitude:{}, latitude:{}", longitude, latitude);
    Map<String, String> params = new ConcurrentHashMap<>();
    params.put(LL_PARAM, String.format("%s,%s", latitude, longitude));
    params.put(CLIENT_ID_PARAM, client_id);
    params.put(CLIENT_SECRET_PARAM, client_secret);
    params.put(VERSION_PARAM, version);
    ResponseEntity<FoursquareExploreResponse> response = restTemplate
        .exchange(baseUrlExplore, HttpMethod.GET, null, FoursquareExploreResponse.class, params);

    if (response != null && response.getStatusCode() == HttpStatus.OK) {
      return response.getBody();
    } else {
      log.error("getFoursquareResponse error:: {}", response);
      return null;
    }

  }

}
