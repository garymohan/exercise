package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class VenuePage {

  private String id;

  public String getId() {
    return id;
  }

  public VenuePage setId(String id) {
    this.id = id;
    return this;
  }

  @Override
  public String toString() {
    return "VenuePage{" +
        "id='" + id + '\'' +
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
    VenuePage venuePage = (VenuePage) o;
    return Objects.equals(id, venuePage.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }
}
