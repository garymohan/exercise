package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class Response
{
  private List<Venues> venues;

  public List<Venues> getVenues() {
    return venues;
  }

  public Response setVenues(
      List<Venues> venues) {
    this.venues = venues;
    return this;
  }

  @Override
  public String toString() {
    return "Response{" +
        "venues=" + venues +
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
    Response response = (Response) o;
    return Objects.equals(venues, response.venues);
  }

  @Override
  public int hashCode() {
    return Objects.hash(venues);
  }
}
