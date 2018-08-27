package uk.co.whitbread.exercise.providers.foursquare.response;


import java.util.Objects;

public class Categories {

  private String id;

  private Icon icon;

  private String primary;

  private String name;

  private String shortName;

  private String pluralName;


  public String getId() {
    return id;
  }

  public Categories setId(String id) {
    this.id = id;
    return this;
  }

  public Icon getIcon() {
    return icon;
  }

  public Categories setIcon(Icon icon) {
    this.icon = icon;
    return this;
  }

  public String getPrimary() {
    return primary;
  }

  public Categories setPrimary(String primary) {
    this.primary = primary;
    return this;
  }

  public String getName() {
    return name;
  }

  public Categories setName(String name) {
    this.name = name;
    return this;
  }

  public String getShortName() {
    return shortName;
  }

  public Categories setShortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

  public String getPluralName() {
    return pluralName;
  }

  public Categories setPluralName(String pluralName) {
    this.pluralName = pluralName;
    return this;
  }

  @Override
  public String toString() {
    return "Categories{" +
        "id='" + id + '\'' +
        ", icon=" + icon +
        ", primary='" + primary + '\'' +
        ", name='" + name + '\'' +
        ", shortName='" + shortName + '\'' +
        ", pluralName='" + pluralName + '\'' +
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
    Categories that = (Categories) o;
    return Objects.equals(id, that.id) &&
        Objects.equals(icon, that.icon) &&
        Objects.equals(primary, that.primary) &&
        Objects.equals(name, that.name) &&
        Objects.equals(shortName, that.shortName) &&
        Objects.equals(pluralName, that.pluralName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, icon, primary, name, shortName, pluralName);
  }
}