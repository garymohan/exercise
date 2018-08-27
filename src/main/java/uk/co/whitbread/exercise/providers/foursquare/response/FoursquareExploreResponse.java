package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class FoursquareExploreResponse {

  private ExploreResponse response;

  private Meta meta;

  public ExploreResponse getResponse() {
    return response;
  }

  public FoursquareExploreResponse setResponse(
      ExploreResponse response) {
    this.response = response;
    return this;
  }

  public Meta getMeta() {
    return meta;
  }

  public FoursquareExploreResponse setMeta(
      Meta meta) {
    this.meta = meta;
    return this;
  }

  @Override
  public String toString() {
    return "FoursquareExploreResponse{" +
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
    FoursquareExploreResponse that = (FoursquareExploreResponse) o;
    return Objects.equals(response, that.response) &&
        Objects.equals(meta, that.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(response, meta);
  }
}
