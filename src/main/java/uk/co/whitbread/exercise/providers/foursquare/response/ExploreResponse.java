package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.List;
import java.util.Objects;

public class ExploreResponse {

  private String totalResults;

  private String headerLocationGranularity;

  private SuggestedBounds suggestedBounds;

  private SuggestedFilters suggestedFilters;

  private String suggestedRadius;

  private String headerLocation;

  private String headerFullLocation;

  private List<Groups> groups;

  public String getTotalResults() {
    return totalResults;
  }

  public ExploreResponse setTotalResults(String totalResults) {
    this.totalResults = totalResults;
    return this;
  }

  public String getHeaderLocationGranularity() {
    return headerLocationGranularity;
  }

  public ExploreResponse setHeaderLocationGranularity(String headerLocationGranularity) {
    this.headerLocationGranularity = headerLocationGranularity;
    return this;
  }

  public SuggestedBounds getSuggestedBounds() {
    return suggestedBounds;
  }

  public ExploreResponse setSuggestedBounds(
      SuggestedBounds suggestedBounds) {
    this.suggestedBounds = suggestedBounds;
    return this;
  }

  public SuggestedFilters getSuggestedFilters() {
    return suggestedFilters;
  }

  public ExploreResponse setSuggestedFilters(
      SuggestedFilters suggestedFilters) {
    this.suggestedFilters = suggestedFilters;
    return this;
  }

  public String getSuggestedRadius() {
    return suggestedRadius;
  }

  public ExploreResponse setSuggestedRadius(String suggestedRadius) {
    this.suggestedRadius = suggestedRadius;
    return this;
  }

  public String getHeaderLocation() {
    return headerLocation;
  }

  public ExploreResponse setHeaderLocation(String headerLocation) {
    this.headerLocation = headerLocation;
    return this;
  }

  public String getHeaderFullLocation() {
    return headerFullLocation;
  }

  public ExploreResponse setHeaderFullLocation(String headerFullLocation) {
    this.headerFullLocation = headerFullLocation;
    return this;
  }

  public List<Groups> getGroups() {
    return groups;
  }

  public ExploreResponse setGroups(
      List<Groups> groups) {
    this.groups = groups;
    return this;
  }

  @Override
  public String toString() {
    return "ExploreResponse{" +
        "totalResults='" + totalResults + '\'' +
        ", headerLocationGranularity='" + headerLocationGranularity + '\'' +
        ", suggestedBounds=" + suggestedBounds +
        ", suggestedFilters=" + suggestedFilters +
        ", suggestedRadius='" + suggestedRadius + '\'' +
        ", headerLocation='" + headerLocation + '\'' +
        ", headerFullLocation='" + headerFullLocation + '\'' +
        ", groups=" + groups +
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
    ExploreResponse that = (ExploreResponse) o;
    return Objects.equals(totalResults, that.totalResults) &&
        Objects.equals(headerLocationGranularity, that.headerLocationGranularity) &&
        Objects.equals(suggestedBounds, that.suggestedBounds) &&
        Objects.equals(suggestedFilters, that.suggestedFilters) &&
        Objects.equals(suggestedRadius, that.suggestedRadius) &&
        Objects.equals(headerLocation, that.headerLocation) &&
        Objects.equals(headerFullLocation, that.headerFullLocation) &&
        Objects.equals(groups, that.groups);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalResults, headerLocationGranularity, suggestedBounds, suggestedFilters,
        suggestedRadius, headerLocation, headerFullLocation, groups);
  }
}
