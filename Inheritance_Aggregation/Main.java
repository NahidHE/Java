/*
 * Main.java
 * This class is used to show the use of Those three classes. 
 */
package Inheritance_Aggregation;

public class Main {
    public static void main(String[] args) {
        Address address = new Address("Kazi Nazrul Islam Avenue", "Dhaka", "Dhaka", "1212");
        Student student = new Student("Doraemon", 20, address, "S12345", "Computer Science");
        student.displayStudent(); // Display the student's details
        // Display the full address of the student
        System.out.println("Full Address: " + student.getFullAddress());
    }
}
