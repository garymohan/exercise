package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class SuggestedFilters {

  private List<Filters> filters;

  private String header;

  public List<Filters> getFilters() {
    return filters;
  }

  public SuggestedFilters setFilters(
      List<Filters> filters) {
    this.filters = filters;
    return this;
  }

  public String getHeader() {
    return header;
  }

  public SuggestedFilters setHeader(String header) {
    this.header = header;
    return this;
  }

  @Override
  public String toString() {
    return "SuggestedFilters{" +
        "filters=" + filters +
        ", header='" + header + '\'' +
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
    SuggestedFilters that = (SuggestedFilters) o;
    return Objects.equals(filters, that.filters) &&
        Objects.equals(header, that.header);
  }

  @Override
  public int hashCode() {
    return Objects.hash(filters, header);
  }
}
