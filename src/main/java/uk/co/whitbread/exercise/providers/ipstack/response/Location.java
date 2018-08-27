package uk.co.whitbread.exercise.providers.ipstack.response;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Location {

  private String is_eu;

  private List<Languages> languages;

  private String country_flag_emoji_unicode;

  private String country_flag;

  private String calling_code;

  private String geoname_id;

  private String country_flag_emoji;

  private String capital;


  public String getIs_eu() {
    return is_eu;
  }

  public Location setIs_eu(String is_eu) {
    this.is_eu = is_eu;
    return this;
  }

  public List<Languages> getLanguages() {
    return languages;
  }

  public Location setLanguages(
      List<Languages> languages) {
    this.languages = languages;
    return this;
  }

  public String getCountry_flag_emoji_unicode() {
    return country_flag_emoji_unicode;
  }

  public Location setCountry_flag_emoji_unicode(String country_flag_emoji_unicode) {
    this.country_flag_emoji_unicode = country_flag_emoji_unicode;
    return this;
  }

  public String getCountry_flag() {
    return country_flag;
  }

  public Location setCountry_flag(String country_flag) {
    this.country_flag = country_flag;
    return this;
  }

  public String getCalling_code() {
    return calling_code;
  }

  public Location setCalling_code(String calling_code) {
    this.calling_code = calling_code;
    return this;
  }

  public String getGeoname_id() {
    return geoname_id;
  }

  public Location setGeoname_id(String geoname_id) {
    this.geoname_id = geoname_id;
    return this;
  }

  public String getCountry_flag_emoji() {
    return country_flag_emoji;
  }

  public Location setCountry_flag_emoji(String country_flag_emoji) {
    this.country_flag_emoji = country_flag_emoji;
    return this;
  }

  public String getCapital() {
    return capital;
  }

  public Location setCapital(String capital) {
    this.capital = capital;
    return this;
  }

  @Override
  public String toString() {
    return "Location{" +
        "is_eu='" + is_eu + '\'' +
        ", languages=" + languages +
        ", country_flag_emoji_unicode='" + country_flag_emoji_unicode + '\'' +
        ", country_flag='" + country_flag + '\'' +
        ", calling_code='" + calling_code + '\'' +
        ", geoname_id='" + geoname_id + '\'' +
        ", country_flag_emoji='" + country_flag_emoji + '\'' +
        ", capital='" + capital + '\'' +
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
    return Objects.equals(is_eu, location.is_eu) &&
        Objects.equals(languages, location.languages) &&
        Objects.equals(country_flag_emoji_unicode, location.country_flag_emoji_unicode) &&
        Objects.equals(country_flag, location.country_flag) &&
        Objects.equals(calling_code, location.calling_code) &&
        Objects.equals(geoname_id, location.geoname_id) &&
        Objects.equals(country_flag_emoji, location.country_flag_emoji) &&
        Objects.equals(capital, location.capital);
  }

  @Override
  public int hashCode() {
    return Objects
        .hash(is_eu, languages, country_flag_emoji_unicode, country_flag, calling_code, geoname_id,
            country_flag_emoji, capital);
  }
}
