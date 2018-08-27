package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class Items {

  private String summary;

  private String reasonName;

  private String type;

  public String getSummary() {
    return summary;
  }

  public Items setSummary(String summary) {
    this.summary = summary;
    return this;
  }

  public String getReasonName() {
    return reasonName;
  }

  public Items setReasonName(String reasonName) {
    this.reasonName = reasonName;
    return this;
  }

  public String getType() {
    return type;
  }

  public Items setType(String type) {
    this.type = type;
    return this;
  }

  @Override
  public String toString() {
    return "Items{" +
        "summary='" + summary + '\'' +
        ", reasonName='" + reasonName + '\'' +
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
    Items items = (Items) o;
    return Objects.equals(summary, items.summary) &&
        Objects.equals(reasonName, items.reasonName) &&
        Objects.equals(type, items.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, reasonName, type);
  }
}
