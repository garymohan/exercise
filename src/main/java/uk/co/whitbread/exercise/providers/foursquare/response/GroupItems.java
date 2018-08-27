package uk.co.whitbread.exercise.providers.foursquare.response;

import java.util.Objects;

public class GroupItems {

  private String referralId;

  private Venue venue;

  private Reasons reasons;


  public String getReferralId() {
    return referralId;
  }

  public GroupItems setReferralId(String referralId) {
    this.referralId = referralId;
    return this;
  }

  public Venue getVenue() {
    return venue;
  }

  public GroupItems setVenue(Venue venue) {
    this.venue = venue;
    return this;
  }

  public Reasons getReasons() {
    return reasons;
  }

  public GroupItems setReasons(
      Reasons reasons) {
    this.reasons = reasons;
    return this;
  }

  @Override
  public String toString() {
    return "GroupItems{" +
        "referralId='" + referralId + '\'' +
        ", venue=" + venue +
        ", reasons=" + reasons +
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
    GroupItems that = (GroupItems) o;
    return Objects.equals(referralId, that.referralId) &&
        Objects.equals(venue, that.venue) &&
        Objects.equals(reasons, that.reasons);
  }

  @Override
  public int hashCode() {
    return Objects.hash(referralId, venue, reasons);
  }
}
