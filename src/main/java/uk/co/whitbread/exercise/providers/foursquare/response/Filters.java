package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class Filters {

  private String name;

  private String key;

  public String getName() {
    return name;
  }

  public Filters setName(String name) {
    this.name = name;
    return this;
  }

  public String getKey() {
    return key;
  }

  public Filters setKey(String key) {
    this.key = key;
    return this;
  }

  @Override
  public String toString() {
    return "Filters{" +
        "name='" + name + '\'' +
        ", key='" + key + '\'' +
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
    Filters filters = (Filters) o;
    return Objects.equals(name, filters.name) &&
        Objects.equals(key, filters.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, key);
  }
}
