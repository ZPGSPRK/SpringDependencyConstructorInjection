package org.genspark;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

// Test class for Address
@SpringBootTest
public class AddressTest {

    // Test case for the constructor of the Address class
    @Test
    public void tesAddressConstructor() {
        // Initialize test data
        String city = "West Chester";
        String state = "Pennsylvania";
        String country = "United States";
        String zipcode = "19382";

        // Create an instance of the Address class using the constructor
        Address address = new Address(city, state, country, zipcode);

        // Validate that the values we set during initialization are returned by the getters
        Assertions.assertEquals(city, address.getCity());
        Assertions.assertEquals(state, address.getState());
        Assertions.assertEquals(country, address.getCountry());
        Assertions.assertEquals(zipcode, address.getZipcode());
    }
}