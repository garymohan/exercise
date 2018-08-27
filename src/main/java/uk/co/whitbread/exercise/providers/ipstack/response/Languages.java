package uk.co.whitbread.exercise.providers.ipstack.response;

import java.util.Objects;

public class Languages {

  private String name;

  private String code;


  public String getName() {
    return name;
  }

  public Languages setName(String name) {
    this.name = name;
    return this;
  }

  public String getCode() {
    return code;
  }

  public Languages setCode(String code) {
    this.code = code;
    return this;
  }

  @Override
  public String toString() {
    return "Languages{" +
        "name='" + name + '\'' +
        ", code='" + code + '\'' +
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
    Languages languages = (Languages) o;
    return Objects.equals(name, languages.name) &&
        Objects.equals(code, languages.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, code);
  }
}
