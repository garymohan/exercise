# Whitbread Middleware Developer Test - Gary Mohan
  
This is built in Spring Boot, using WireMock for testing.  Payloads are in test/resources/jsonResponses.

Given that Foursquare requires either that latitude/longitude or 
a geographical location is specified, I have made the simplifying assumption that we will attempt
to automatically determine the user's geolocation using their IP address.

For this reason, PlaceNameSearchService makes three REST calls:

1. A call is made to IPStack attempting to get latitude/longitude for the user's IP address.  
If this can't be determined, it defaults to London's latitude/longtitude 
(as a simplifying assumption for this exercise).

2. A call is made to Foursquare's search service to try and get the venue's (as opposed to user's) 
latitude/longitude.

3. A call is made to Foursquare's explore service to get the list of recommended venues nearby.

The result from the explore service REST call is flattened to get the list of venues 
and then passed back to PlaceNameSearchController which uses a simple POJO to wrap the result.

I have put some comments in the code to explain what I'm doing.

Please note, in unit tests I use Gson to independently map the expected payload into the relevant 
object and then use a single assertEquals to test that that object is valid.  This is
more maintainable and avoids cluttering unit tests with loads of asserts.

If I had more time, I would have put in various negative test cases.


## Usage
```
mvn spring-boot:run
```

## Testing

    http://localhost:8080/placenamesearch/{placename}
    
    For example:
    
    http://localhost:8080/placenamesearch/starbucks
    



