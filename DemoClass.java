/*
 * DemoClass.java
 * This class demonstrates the structure of a Java class.
 * 
 * Syntax:
        public class ClassName {
            // Class body
        }
 */
public class DemoClass {
    // A class can contain fields, methods, etc.
    int number; // Example field
    String text; // Another example field
    
    int getNumber() { // Example of a method
        return number;
    }

    void printText() { // Another method
        System.out.println(text);
    }

    // main method to run the class
    public static void main(String[] args) {
        // Creating an instance of DemoClass
        DemoClass demo = new DemoClass();
        demo.number = 10; // Setting the number field
        demo.text = "Hello, DemoClass!"; // Setting the text field
        // Calling methods
        System.out.println("Number: " + demo.getNumber());
        demo.printText();
    }
}
