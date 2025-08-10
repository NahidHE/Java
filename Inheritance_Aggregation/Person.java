/*
 * Person.java
 * This class represents a person with a name, some properties and an address.
 */
package Inheritance_Aggregation;

public class Person {
    String name;
    int age;
    Address address; // Aggregation relationship with Address

    // constructor
    public Person(String name, int age,  Address address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    // To display the person's details
    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: ");
        // Call the displayAddress method of Address class
        address.displayAddress(); // Display the associated address
    }

    // To get the full address of the person
    public String getFullAddress() {
        return address.getAddress();
    }
}