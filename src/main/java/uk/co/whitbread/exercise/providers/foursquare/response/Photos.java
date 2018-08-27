package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class Photos {

  private String count;

  private List<String> groups;

  public String getCount() {
    return count;
  }

  public Photos setCount(String count) {
    this.count = count;
    return this;
  }

  public List<String> getGroups() {
    return groups;
  }

  public Photos setGroups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  @Override
  public String toString() {
    return "Photos{" +
        "count='" + count + '\'' +
        ", groups=" + groups +
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
    Photos photos = (Photos) o;
    return Objects.equals(count, photos.count) &&
        Objects.equals(groups, photos.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, groups);
  }
}
