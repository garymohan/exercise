package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class FoursquareSearchResponse {

  private Response response;

  private Meta meta;


  public Response getResponse() {
    return response;
  }

  public FoursquareSearchResponse setResponse(
      Response response) {
    this.response = response;
    return this;
  }

  public Meta getMeta() {
    return meta;
  }

  public FoursquareSearchResponse setMeta(
      Meta meta) {
    this.meta = meta;
    return this;
  }

  @Override
  public String toString() {
    return "FoursquareResponse{" +
        "response=" + response +
        ", meta=" + meta +
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
    FoursquareSearchResponse that = (FoursquareSearchResponse) o;
    return Objects.equals(response, that.response) &&
        Objects.equals(meta, that.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, meta);
  }
}
