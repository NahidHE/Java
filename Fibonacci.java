/*
 * Fibonacci.java
 * This class calculates Fibonacci numbers.
 */
public class Fibonacci {
    // Method to calculate the nth Fibonacci number (recursive approach)
    public int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0; // Base case for n = 0
        } else if (n == 1) {
            return 1; // Base case for n = 1
        } else {
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2); // Recursive case
        }
    }

    // Method to calculate the nth Fibonacci number (iterative approach)
    public int fibonacciIterative(int n) { 
        if (n <= 0) {
            return 0; // Base case for n = 0
        } else if (n == 1) {
            return 1; // Base case for n = 1
        }
        
        int a = 0, b = 1, c = 0;
        for (int i = 2; i <= n; i++) {
            c = a + b; // Calculate the next Fibonacci number
            a = b; // Update a to the previous Fibonacci number
            b = c; // Update b to the current Fibonacci number
        }
        return c; // Return the nth Fibonacci number
    }

    // Main method to test the Fibonacci class
    public static void main(String[] args) {
        Fibonacci fibonacciCalculator = new Fibonacci();
        
        // Testing Fibonacci numbers from 0 to 10
        System.out.println("Fibonacci numbers from 0 to 10:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(fibonacciCalculator.fibonacciIterative(i) + " ");
        }
        
        // Testing the recursive method
        System.out.println("\nFibonacci number at position 5 (recursive): " + 
                           fibonacciCalculator.fibonacciRecursive(5));
    }
    
}
