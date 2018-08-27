package uk.co.whitbread.exercise.providers.foursquare.response;


import java.util.Objects;

public class Icon
{
  private String prefix;

  private String suffix;

  public String getPrefix() {
    return prefix;
  }

  public Icon setPrefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

  public String getSuffix() {
    return suffix;
  }

  public Icon setSuffix(String suffix) {
    this.suffix = suffix;
    return this;
  }

  @Override
  public String toString() {
    return "Icon{" +
        "prefix='" + prefix + '\'' +
        ", suffix='" + suffix + '\'' +
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
    Icon icon = (Icon) o;
    return Objects.equals(prefix, icon.prefix) &&
        Objects.equals(suffix, icon.suffix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prefix, suffix);
  }
}

