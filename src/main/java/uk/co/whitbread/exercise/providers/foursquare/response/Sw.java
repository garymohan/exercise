package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class Sw {

  private String lng;

  private String lat;

  public String getLng() {
    return lng;
  }

  public Sw setLng(String lng) {
    this.lng = lng;
    return this;
  }

  public String getLat() {
    return lat;
  }

  public Sw setLat(String lat) {
    this.lat = lat;
    return this;
  }

  @Override
  public String toString() {
    return "Sw{" +
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
    Sw sw = (Sw) o;
    return Objects.equals(lng, sw.lng) &&
        Objects.equals(lat, sw.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lng, lat);
  }
}
