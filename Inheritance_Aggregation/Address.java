/*
 * Address.java
 * This class represents an address with street, city, state, and zip code.
 */
package Inheritance_Aggregation;

public class Address {
    String street, city, state, zip;

    // constructor
    public Address(String street, String city, String state, String zip) {
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    // To display the address
    public void displayAddress() {
        System.out.println("Street: " + street);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip: " + zip);
    }

    // To get the full address as a string
    public String getAddress() {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
