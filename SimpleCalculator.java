/*
 * SimpleCalculator.java
 * This class provides basic arithmetic operations.
 * It includes methods for addition, subtraction, multiplication, and division.
 * Each method takes two double parameters and returns the result as a double.
 * Also you can learn how to create an object of a class and call its methods.
 */
public class SimpleCalculator {
    double add(double a, double b) {
        return a + b;
    }
    double subtract(double a, double b) {
        return a - b;
    }
    double multiply(double a, double b) {
        return a * b;
    }
    double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
        }
        return a / b;
    }
}

// To execute this code, you can create a main method in another class or in the same class.
class Main {
    public static void main(String[] args) {
        // Creating an instance of SimpleCalculator and performing operations
        SimpleCalculator calculator = new SimpleCalculator();
        // Example operations
        System.out.println("Addition: " + calculator.add(5, 3));
        System.out.println("Subtraction: " + calculator.subtract(5, 3));
        System.out.println("Multiplication: " + calculator.multiply(5, 3));
        System.out.println("Division: " + calculator.divide(5, 3));
    }
}
