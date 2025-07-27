/*
 * Number.java
 * This class provides methods to check if a number is even, prime or goldbach conjecture is true.
 * It is used by the UML class to display information about a number.
 */

import java.lang.Math;

public class Number {
    public int number;

    public boolean isEven() {
        return number % 2 == 0; // Check if the number is even
    }

    public boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime numbers
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false; // Found a divisor, not prime
        }
        return true; // No divisors found, it is prime
    }

    public boolean isPrime() {
        return isPrime(number); // Delegate to the overloaded method
    }

    public boolean isGoldbach(){
        if((number >4) && (number % 2 == 0)) {
            for (int i = 2; i <= number / 2; i++) {
                if (isPrime(i) && isPrime(number - i)) {
                    return true; // Found two primes that sum to the number
                }
            }
        }
        return false; // No such primes found
    }
    
}
