package uk.co.whitbread.exercise.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import uk.co.whitbread.exercise.providers.foursquare.FourSquareProvider;
import uk.co.whitbread.exercise.providers.foursquare.response.FoursquareExploreResponse;
import uk.co.whitbread.exercise.providers.foursquare.response.FoursquareSearchResponse;
import uk.co.whitbread.exercise.providers.foursquare.response.GroupItems;
import uk.co.whitbread.exercise.providers.foursquare.response.Groups;
import uk.co.whitbread.exercise.providers.foursquare.response.Venue;
import uk.co.whitbread.exercise.providers.foursquare.response.Venues;
import uk.co.whitbread.exercise.providers.ipstack.response.IPStackResponse;
import uk.co.whitbread.exercise.providers.ipstatck.IPStackProvider;

@Service
public class PlaceNameSearchService {

  @Autowired
  private FourSquareProvider fourSquareProvider;
  @Autowired
  private IPStackProvider ipStackProvider;
  @Value("${london.longitude}")
  private String londonLongitude;
  @Value("${london.latitude}")
  private String londonLatitude;

  public List<Venue> getRecommendedPlacesNearNamedVenue(String ip, String name) {

    //Default longitude / latitude values to London in case it's not possible to resolve these values
    // from the user's IP address.
    String longitude = londonLongitude;
    String latitude = londonLatitude;

    //The user's IP address is used to get the user's longitude  and latitude.
    //In a production system, I would have extra method / endpoint paramaters to allow a mobile app
    //to supply its own geolocation data and for the user to manually enter their location.

    IPStackResponse ipStackResponse = ipStackProvider.getIPStackRespomse(ip);

    if (ipStackResponse != null && ipStackResponse.getLongitude() != null
        && ipStackResponse.getLatitude() != null) {
      longitude = ipStackResponse.getLongitude();
      latitude = ipStackResponse.getLatitude();
    }

    FoursquareSearchResponse placeNameResponse = fourSquareProvider
        .getPlaceNameFoursquareResponse(latitude,longitude, name);

    //The application properties providers.foursquare.limit=1 and providers.foursquare.llAcc=1
    //used in the call above limits the result to a single item as close as possible to the
    //user's longitude and latitude, which is why get(0) is below:
    Venues firstVenue = placeNameResponse.getResponse().getVenues().get(0);

    //We now get the venue's longitude / latitude (as opposed to the user's).
    String venueLongtitude = firstVenue.getLocation().getLng();
    String venueLatitude = firstVenue.getLocation().getLat();

    //Now the data we actually want from Foursquare's 'explore' endpoint
    FoursquareExploreResponse foursquareExploreResponse = fourSquareProvider
        .getExploreFoursquareResponse(venueLatitude, venueLongtitude);

    //Reduce this down to a List of Venue objects.
    return foursquareExploreResponse.getResponse().getGroups().stream().map(Groups::getItems)
        .flatMap(List::stream).collect(Collectors.toList()).stream().map(GroupItems::getVenue)
        .collect(Collectors.toList());

  }


}
