/*
 * LeapYear.java
 * This class checks if a year is a leap year.
 */
public class LeapYear {
    // Method to check if a year is a leap year
    public boolean isLeapYear(int year) {
        // A year is a leap year if it is divisible by 4,
        // but not divisible by 100, unless it is also divisible by 400
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0; // Divisible by 400 means it's a leap year
            }
            return true; // Divisible by 4 but not by 100 means it's a leap year
        }
        return false; // Not divisible by 4 means it's not a leap year
    }

    // Main method to test the LeapYear class
    public static void main(String[] args) {
        LeapYear leapYearChecker = new LeapYear();
        
        // Testing leap years from 2000 to 2020
        System.out.println("Leap years from 2000 to 2020:");
        for (int year = 2000; year <= 2020; year++) {
            if (leapYearChecker.isLeapYear(year)) {
                System.out.print(year + " ");
            }
        }
    }
}
