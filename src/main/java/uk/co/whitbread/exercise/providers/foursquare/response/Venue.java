package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class Venue {

  private Photos photos;

  private String id;

  private Location location;

  private VenuePage venuePage;

  private String name;

  private List<Categories> categories;

  public Photos getPhotos() {
    return photos;
  }

  public Venue setPhotos(Photos photos) {
    this.photos = photos;
    return this;
  }

  public String getId() {
    return id;
  }

  public Venue setId(String id) {
    this.id = id;
    return this;
  }

  public Location getLocation() {
    return location;
  }

  public Venue setLocation(Location location) {
    this.location = location;
    return this;
  }

  public String getName() {
    return name;
  }

  public Venue setName(String name) {
    this.name = name;
    return this;
  }

  public List<Categories> getCategories() {
    return categories;
  }

  public Venue setCategories(
      List<Categories> categories) {
    this.categories = categories;
    return this;
  }

  public VenuePage getVenuePage() {
    return venuePage;
  }

  public Venue setVenuePage(
      VenuePage venuePage) {
    this.venuePage = venuePage;
    return this;
  }

  @Override
  public String toString() {
    return "Venue{" +
        "photos=" + photos +
        ", id='" + id + '\'' +
        ", location=" + location +
        ", venuePage=" + venuePage +
        ", name='" + name + '\'' +
        ", categories=" + categories +
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
    Venue venue = (Venue) o;
    return Objects.equals(photos, venue.photos) &&
        Objects.equals(id, venue.id) &&
        Objects.equals(location, venue.location) &&
        Objects.equals(venuePage, venue.venuePage) &&
        Objects.equals(name, venue.name) &&
        Objects.equals(categories, venue.categories);
  }

  @Override
  public int hashCode() {
    return Objects.hash(photos, id, location, venuePage, name, categories);
  }
}
