/*
 * ScientificCalculator.java
 * This class use Java's Math class to perform scientific calculations.
 * It includes methods for square root, power, sine, and cosine calculations.
 */
import java.lang.Math; // Importing the Math class from the java.lang package

public class ScientificCalculator {

    // Method to calculate the square root of a number
    public double squareRoot(double number) {
        return Math.sqrt(number);
    }

    // Method to calculate the power of a number
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Method to calculate the sine of an angle in radians
    public double sine(double angle) {
        return Math.sin(angle);
    }

    // Method to calculate the cosine of an angle in radians
    public double cosine(double angle) {
        return Math.cos(angle);
    }

    // Main method to test the calculator
    public static void main(String[] args) {
        // Creating an instance of ScinetificCalculator
        ScientificCalculator calculator = new ScientificCalculator();
        
        System.out.println("Square root of 16: " + calculator.squareRoot(16));
        System.out.println("2 raised to the power of 3: " + calculator.power(2, 3));
        System.out.println("Sine of π/2: " + calculator.sine(Math.PI / 2));
        System.out.println("Cosine of π: " + calculator.cosine(Math.PI));
    }
    
}
