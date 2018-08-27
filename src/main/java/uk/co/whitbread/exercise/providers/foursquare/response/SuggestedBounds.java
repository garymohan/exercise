package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class SuggestedBounds {

  private Ne ne;

  private Sw sw;

  public Ne getNe() {
    return ne;
  }

  public SuggestedBounds setNe(Ne ne) {
    this.ne = ne;
    return this;
  }

  public Sw getSw() {
    return sw;
  }

  public SuggestedBounds setSw(Sw sw) {
    this.sw = sw;
    return this;
  }

  @Override
  public String toString() {
    return "SuggestedBounds{" +
        "ne=" + ne +
        ", sw=" + sw +
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
    SuggestedBounds that = (SuggestedBounds) o;
    return Objects.equals(ne, that.ne) &&
        Objects.equals(sw, that.sw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ne, sw);
  }
}
