package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class Location {

  private String distance;

  private String postalCode;

  private List<LabeledLatLngs> labeledLatLngs;

  private String address;

  private String state;

  private List<String> formattedAddress;

  private String lng;

  private String cc;

  private String lat;

  private String country;

  private String city;

  private String crossStreet;

  public String getDistance() {
    return distance;
  }

  public Location setDistance(String distance) {
    this.distance = distance;
    return this;
  }

  public String getPostalCode() {
    return postalCode;
  }

  public Location setPostalCode(String postalCode) {
    this.postalCode = postalCode;
    return this;
  }

  public List<LabeledLatLngs> getLabeledLatLngs() {
    return labeledLatLngs;
  }

  public Location setLabeledLatLngs(
      List<LabeledLatLngs> labeledLatLngs) {
    this.labeledLatLngs = labeledLatLngs;
    return this;
  }

  public String getAddress() {
    return address;
  }

  public Location setAddress(String address) {
    this.address = address;
    return this;
  }

  public String getState() {
    return state;
  }

  public Location setState(String state) {
    this.state = state;
    return this;
  }

  public List<String> getFormattedAddress() {
    return formattedAddress;
  }

  public Location setFormattedAddress(List<String> formattedAddress) {
    this.formattedAddress = formattedAddress;
    return this;
  }

  public String getLng() {
    return lng;
  }

  public Location setLng(String lng) {
    this.lng = lng;
    return this;
  }

  public String getCc() {
    return cc;
  }

  public Location setCc(String cc) {
    this.cc = cc;
    return this;
  }

  public String getLat() {
    return lat;
  }

  public Location setLat(String lat) {
    this.lat = lat;
    return this;
  }

  public String getCountry() {
    return country;
  }

  public Location setCountry(String country) {
    this.country = country;
    return this;
  }

  public String getCity() {
    return city;
  }

  public Location setCity(String city) {
    this.city = city;
    return this;
  }

  public String getCrossStreet() {
    return crossStreet;
  }

  public Location setCrossStreet(String crossStreet) {
    this.crossStreet = crossStreet;
    return this;
  }

  @Override
  public String toString() {
    return "Location{" +
        "distance='" + distance + '\'' +
        ", postalCode='" + postalCode + '\'' +
        ", labeledLatLngs=" + labeledLatLngs +
        ", address='" + address + '\'' +
        ", state='" + state + '\'' +
        ", formattedAddress=" + formattedAddress +
        ", lng='" + lng + '\'' +
        ", cc='" + cc + '\'' +
        ", lat='" + lat + '\'' +
        ", country='" + country + '\'' +
        ", city='" + city + '\'' +
        ", crossStreet='" + crossStreet + '\'' +
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
    Location location = (Location) o;
    return Objects.equals(distance, location.distance) &&
        Objects.equals(postalCode, location.postalCode) &&
        Objects.equals(labeledLatLngs, location.labeledLatLngs) &&
        Objects.equals(address, location.address) &&
        Objects.equals(state, location.state) &&
        Objects.equals(formattedAddress, location.formattedAddress) &&
        Objects.equals(lng, location.lng) &&
        Objects.equals(cc, location.cc) &&
        Objects.equals(lat, location.lat) &&
        Objects.equals(country, location.country) &&
        Objects.equals(city, location.city) &&
        Objects.equals(crossStreet, location.crossStreet);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(distance, postalCode, labeledLatLngs, address, state, formattedAddress, lng, cc, lat,
            country, city, crossStreet);
  }
}