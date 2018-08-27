package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class Groups {

  private List<GroupItems> items;

  private String name;

  private String type;


  public List<GroupItems> getItems() {
    return items;
  }

  public Groups setItems(
      List<GroupItems> items) {
    this.items = items;
    return this;
  }

  public String getName() {
    return name;
  }

  public Groups setName(String name) {
    this.name = name;
    return this;
  }

  public String getType() {
    return type;
  }

  public Groups setType(String type) {
    this.type = type;
    return this;
  }

  @Override
  public String toString() {
    return "Groups{" +
        "items=" + items +
        ", name='" + name + '\'' +
        ", type='" + type + '\'' +
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
    Groups groups = (Groups) o;
    return Objects.equals(items, groups.items) &&
        Objects.equals(name, groups.name) &&
        Objects.equals(type, groups.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, type);
  }
}
