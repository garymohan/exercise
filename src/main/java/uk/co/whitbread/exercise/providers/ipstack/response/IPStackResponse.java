package uk.co.whitbread.exercise.providers.ipstack.response;

import java.util.Objects;

public class IPStackResponse {

  private String continent_code;

  private String zip;

  private Location location;

  private String type;

  private String country_code;

  private String country_name;

  private String ip;

  private String city;

  private String continent_name;

  private String region_name;

  private String region_code;

  private String longitude;

  private String latitude;

  public String getContinent_code() {
    return continent_code;
  }

  public IPStackResponse setContinent_code(String continent_code) {
    this.continent_code = continent_code;
    return this;
  }

  public String getZip() {
    return zip;
  }

  public IPStackResponse setZip(String zip) {
    this.zip = zip;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public IPStackResponse setLocation(
      Location location) {
    this.location = location;
    return this;
  }

  public String getType() {
    return type;
  }

  public IPStackResponse setType(String type) {
    this.type = type;
    return this;
  }

  public String getCountry_code() {
    return country_code;
  }

  public IPStackResponse setCountry_code(String country_code) {
    this.country_code = country_code;
    return this;
  }

  public String getCountry_name() {
    return country_name;
  }

  public IPStackResponse setCountry_name(String country_name) {
    this.country_name = country_name;
    return this;
  }

  public String getIp() {
    return ip;
  }

  public IPStackResponse setIp(String ip) {
    this.ip = ip;
    return this;
  }

  public String getCity() {
    return city;
  }

  public IPStackResponse setCity(String city) {
    this.city = city;
    return this;
  }

  public String getContinent_name() {
    return continent_name;
  }

  public IPStackResponse setContinent_name(String continent_name) {
    this.continent_name = continent_name;
    return this;
  }

  public String getRegion_name() {
    return region_name;
  }

  public IPStackResponse setRegion_name(String region_name) {
    this.region_name = region_name;
    return this;
  }

  public String getRegion_code() {
    return region_code;
  }

  public IPStackResponse setRegion_code(String region_code) {
    this.region_code = region_code;
    return this;
  }

  public String getLongitude() {
    return longitude;
  }

  public IPStackResponse setLongitude(String longitude) {
    this.longitude = longitude;
    return this;
  }

  public String getLatitude() {
    return latitude;
  }

  public IPStackResponse setLatitude(String latitude) {
    this.latitude = latitude;
    return this;
  }

  @Override
  public String toString() {
    return "IPStackResponse{" +
        "continent_code='" + continent_code + '\'' +
        ", zip='" + zip + '\'' +
        ", location=" + location +
        ", type='" + type + '\'' +
        ", country_code='" + country_code + '\'' +
        ", country_name='" + country_name + '\'' +
        ", ip='" + ip + '\'' +
        ", city='" + city + '\'' +
        ", continent_name='" + continent_name + '\'' +
        ", region_name='" + region_name + '\'' +
        ", region_code='" + region_code + '\'' +
        ", longitude='" + longitude + '\'' +
        ", latitude='" + latitude + '\'' +
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
    IPStackResponse that = (IPStackResponse) o;
    return Objects.equals(continent_code, that.continent_code) &&
        Objects.equals(zip, that.zip) &&
        Objects.equals(location, that.location) &&
        Objects.equals(type, that.type) &&
        Objects.equals(country_code, that.country_code) &&
        Objects.equals(country_name, that.country_name) &&
        Objects.equals(ip, that.ip) &&
        Objects.equals(city, that.city) &&
        Objects.equals(continent_name, that.continent_name) &&
        Objects.equals(region_name, that.region_name) &&
        Objects.equals(region_code, that.region_code) &&
        Objects.equals(longitude, that.longitude) &&
        Objects.equals(latitude, that.latitude);
  }

  @Override
  public int hashCode() {
    return Objects.hash(continent_code, zip, location, type, country_code, country_name, ip, city,
        continent_name, region_name, region_code, longitude, latitude);
  }
}
