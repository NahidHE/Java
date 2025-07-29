/*
 * Constructor.java
 * This class is to demonstrate the structure of a Java class with a constructor.
 */

public class Constructor {
    // Fields of the class
    int value; 

    // Constructor to initialize the field
    public Constructor(int initialValue) {
        this.value = initialValue; // Assigning the parameter to the field
    }

    // Method to get the value
    int getValue() {
        return value;
    }

    // Main method to run the class
    public static void main(String[] args) {
        // Creating an instance of Constructor with an initial value
        Constructor constructorExample = new Constructor(42);
        // Calling method to get the value
        System.out.println("Value: " + constructorExample.getValue());
    }
    
}
