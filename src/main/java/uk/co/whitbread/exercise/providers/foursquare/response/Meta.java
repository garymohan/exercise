package uk.co.whitbread.exercise.providers.foursquare.response;


import java.util.Objects;

public class Meta
{
  private String requestId;

  private String code;

  public String getRequestId() {
    return requestId;
  }

  public Meta setRequestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

  public String getCode() {
    return code;
  }

  public Meta setCode(String code) {
    this.code = code;
    return this;
  }

  @Override
  public String toString() {
    return "Meta{" +
        "requestId='" + requestId + '\'' +
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
    Meta meta = (Meta) o;
    return Objects.equals(requestId, meta.requestId) &&
        Objects.equals(code, meta.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, code);
  }
}
