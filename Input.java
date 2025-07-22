/*
 * Input.java
 * This program is to show the use of Scanner class for input.
 */

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the console
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine(); // Read a line of text input for the name
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();// Read an integer input for the age

        System.out.print("Enter your CGPA: ");
        float cgpa = scanner.nextFloat(); // Read a float input for the CGPA
        
        System.out.println("Hello " + name + ", you are " + age + " years old.");
        System.out.println("Your CGPA is: " + cgpa);
        
        scanner.close();
    }
}
