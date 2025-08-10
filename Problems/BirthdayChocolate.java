/*
    Nobita had a simple rule in life — never miss a friend’s birthday party.
    Every year, he made sure to bring chocolate bars as gifts. But Nobita was no ordinary gift-giver — he had his own quirky plan.

    For each friend, Nobita kept track of exactly how many birthdays he had attended. The more birthdays he went to, the more chocolates he would give. However, if a friend ever forgot to invite him, that year didn’t count toward the chocolates tally.

    One day, Nobita decided to make things easier for himself.
    He wrote a Java program that:

    - Took his friend’s date of birth and the current year.

    - Asked how many birthdays he wasn’t invited to.

    - Calculated the exact number of chocolates he should give based on the parties he had attended.

    With this clever program, Nobita never had to worry about forgetting how many chocolates to bring — his computer would decide for him!
*/

package Problems;

import java.util.Scanner;
import java.time.LocalDate;

public class BirthdayChocolate {
    LocalDate dateOfBirth; // Date of birth of the friend
    int currentYear; // Current year
    int missedBirthdays; // Number of birthdays Nobita wasn't invited to
    int chocolates; // Number of chocolates to give
    // Take inputs
    public void takeInputs() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date of birth (YYYY-MM-DD): ");
        String dobInput = scanner.nextLine();
        dateOfBirth = LocalDate.parse(dobInput); // Parse the input to LocalDate
        System.out.print("Enter the current year: ");
        currentYear = scanner.nextInt();
        System.out.print("Enter the number of missed birthdays: ");
        missedBirthdays = scanner.nextInt();
        scanner.close();
    }

    // Check if the year is a leap year
    public boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Calculate the number of chocolates
    public void calculateChocolates() {
        // Check if the date is valid
        if (dateOfBirth.getYear() > currentYear) {
            System.out.println("Invalid date of birth. It cannot be in the future.");
            return;
        }
        // Test leap year date and current year
        else if (dateOfBirth.getMonthValue() == 2 && dateOfBirth.getDayOfMonth() == 29 && !isLeapYear(currentYear)) {
            System.out.println("Invalid date of birth. February 29 is not valid in the current year.");
            return;
        }
        // Date of birth is leap year and current year is also leap year
        else if (dateOfBirth.getMonthValue() == 2 && dateOfBirth.getDayOfMonth() == 29 && isLeapYear(currentYear)) {
            chocolates = ((currentYear - dateOfBirth.getYear())/4) - missedBirthdays; 
        }
        else{
            chocolates = (currentYear - dateOfBirth.getYear()) - missedBirthdays; // Exclude the current year
        }

    }
    // Run the program
    public static void main(String[] args) {
        BirthdayChocolate birthdayChocolate = new BirthdayChocolate();
        birthdayChocolate.takeInputs(); // Take inputs from the user
        birthdayChocolate.calculateChocolates(); // Calculate the number of chocolates
        System.out.println("Number of chocolates to give: " + birthdayChocolate.chocolates); // Display the result
    }
}
