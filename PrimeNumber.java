/*
 * PrimeNumber.java
 * This class checks if a number is prime.
 */
public class PrimeNumber {
    // Method to check if a number is prime
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false; // 0 and 1 are not prime numbers
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, so it's not prime
            }
        }
        return true; // No divisors found, so it is prime
    }

    // Main method to test the PrimeNumber class
    public static void main(String[] args) {
        PrimeNumber primeChecker = new PrimeNumber();
        
        // Printing all prime numbers from 1 to 100
        System.out.println("Prime numbers from 1 to 100:");
        for (int i = 1; i <= 100; i++) {
            if (primeChecker.isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
