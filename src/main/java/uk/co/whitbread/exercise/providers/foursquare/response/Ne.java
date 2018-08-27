package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class Ne {

  private String lng;

  private String lat;

  public String getLng() {
    return lng;
  }

  public Ne setLng(String lng) {
    this.lng = lng;
    return this;
  }

  public String getLat() {
    return lat;
  }

  public Ne setLat(String lat) {
    this.lat = lat;
    return this;
  }

  @Override
  public String toString() {
    return "Ne{" +
        "lng='" + lng + '\'' +
        ", lat='" + lat + '\'' +
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
    Ne ne = (Ne) o;
    return Objects.equals(lng, ne.lng) &&
        Objects.equals(lat, ne.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lng, lat);
  }
}
