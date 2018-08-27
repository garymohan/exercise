package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class Venues
{
  private String referralId;

  private String id;

  private Location location;

  private String name;

  private List<Categories> categories;

  private String hasPerk;

  public String getReferralId() {
    return referralId;
  }

  public Venues setReferralId(String referralId) {
    this.referralId = referralId;
    return this;
  }

  public String getId() {
    return id;
  }

  public Venues setId(String id) {
    this.id = id;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public Venues setLocation(
      Location location) {
    this.location = location;
    return this;
  }

  public String getName() {
    return name;
  }

  public Venues setName(String name) {
    this.name = name;
    return this;
  }

  public List<Categories> getCategories() {
    return categories;
  }

  public Venues setCategories(
      List<Categories> categories) {
    this.categories = categories;
    return this;
  }

  public String getHasPerk() {
    return hasPerk;
  }

  public Venues setHasPerk(String hasPerk) {
    this.hasPerk = hasPerk;
    return this;
  }

  @Override
  public String toString() {
    return "Venues{" +
        "referralId='" + referralId + '\'' +
        ", id='" + id + '\'' +
        ", location=" + location +
        ", name='" + name + '\'' +
        ", categories=" + categories +
        ", hasPerk='" + hasPerk + '\'' +
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
    Venues venues = (Venues) o;
    return Objects.equals(referralId, venues.referralId) &&
        Objects.equals(id, venues.id) &&
        Objects.equals(location, venues.location) &&
        Objects.equals(name, venues.name) &&
        Objects.equals(categories, venues.categories) &&
        Objects.equals(hasPerk, venues.hasPerk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referralId, id, location, name, categories, hasPerk);
  }
}
