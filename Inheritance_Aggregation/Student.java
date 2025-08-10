/*
 * Student.java
 * This class represents a student, which is a type of person with additional properties.
 */
package Inheritance_Aggregation;

public class Student extends Person {
    String studentId;
    String major;

    // constructor
    public Student(String name, int age, Address address, String studentId, String major) {
        super(name, age, address); // Call the constructor of Person
        this.studentId = studentId;
        this.major = major;
    }

    // To display the student's details
    public void displayStudent() {
        displayPerson(); // Call the displayPerson method from Person class
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
    
}
