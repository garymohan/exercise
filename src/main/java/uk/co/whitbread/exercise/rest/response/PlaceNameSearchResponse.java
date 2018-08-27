package uk.co.whitbread.exercise.rest.response;

import java.util.List;
import java.util.Objects;
import uk.co.whitbread.exercise.providers.foursquare.response.Venue;

public class PlaceNameSearchResponse {

  private List<Venue> venue;

  public List<Venue> getVenue() {
    return venue;
  }

  public PlaceNameSearchResponse setVenue(
      List<Venue> venue) {
    this.venue = venue;
    return this;
  }

  @Override
  public String toString() {
    return "PlaceNameSearchResponse{" +
        "venue=" + venue +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlaceNameSearchResponse response = (PlaceNameSearchResponse) o;
    return Objects.equals(venue, response.venue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(venue);
  }
}
