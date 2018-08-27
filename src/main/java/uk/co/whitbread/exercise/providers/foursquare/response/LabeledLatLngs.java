package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class LabeledLatLngs
{
  private String lng;

  private String label;

  private String lat;

  public String getLng() {
    return lng;
  }

  public LabeledLatLngs setLng(String lng) {
    this.lng = lng;
    return this;
  }

  public String getLabel() {
    return label;
  }

  public LabeledLatLngs setLabel(String label) {
    this.label = label;
    return this;
  }

  public String getLat() {
    return lat;
  }

  public LabeledLatLngs setLat(String lat) {
    this.lat = lat;
    return this;
  }

  @Override
  public String toString() {
    return "LabeledLatLngs{" +
        "lng='" + lng + '\'' +
        ", label='" + label + '\'' +
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
    LabeledLatLngs that = (LabeledLatLngs) o;
    return Objects.equals(lng, that.lng) &&
        Objects.equals(label, that.label) &&
        Objects.equals(lat, that.lat);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lng, label, lat);
  }
}