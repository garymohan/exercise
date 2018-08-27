package uk.co.whitbread.exercise.rest;


import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import uk.co.whitbread.exercise.providers.foursquare.response.Venue;
import uk.co.whitbread.exercise.rest.response.PlaceNameSearchResponse;
import uk.co.whitbread.exercise.service.PlaceNameSearchService;

/**
 * This is a Spring MVC controller for the root on http://localhost:8080/ in this exercise.
 *
 * @author garymohan
 */
@RestController
public class PlaceNameSearchController {

  @Autowired
  private PlaceNameSearchService placeNameSearchService;

  @GetMapping(value = "/placenamesearch/{name}", produces = "application/json")
  @ResponseStatus(HttpStatus.OK)
  public @ResponseBody
  PlaceNameSearchResponse getPlaceNameSearch(HttpServletRequest request, @PathVariable("name") String name) {
    String ipAddress = request.getRemoteAddr();
    PlaceNameSearchResponse response = new PlaceNameSearchResponse();
    response.setVenue(placeNameSearchService.getRecommendedPlacesNearNamedVenue(ipAddress, name));
    return response;
  }


}
