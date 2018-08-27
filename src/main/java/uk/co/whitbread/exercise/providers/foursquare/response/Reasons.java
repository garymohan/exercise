package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class Reasons {

  private String count;

  private List<Items> items;


  public String getCount() {
    return count;
  }

  public Reasons setCount(String count) {
    this.count = count;
    return this;
  }

  public List<Items> getItems() {
    return items;
  }

  public Reasons setItems(
      List<Items> items) {
    this.items = items;
    return this;
  }

  @Override
  public String toString() {
    return "Reasons{" +
        "count='" + count + '\'' +
        ", items=" + items +
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
    Reasons reasons = (Reasons) o;
    return Objects.equals(count, reasons.count) &&
        Objects.equals(items, reasons.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, items);
  }
}
