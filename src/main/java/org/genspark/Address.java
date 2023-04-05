package org.genspark;

import org.springframework.stereotype.Component;

@SuppressWarnings({"unused", "FieldCanBeLocal"})
@Component
public class Address {
    private final String city;
    private final String state;
    private final String country;
    private final String zipcode;

    public Address(String city, String state, String country, String zipcode) {
        this.city = city;
        this.state = state;
        this.country = country;
        this.zipcode = zipcode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", zipcode='" + zipcode + '\'' +
                '}';
    }
}
