/*
 * UML.java
 * This class is used to display information about a number, including whether it is even, prime, and if the Goldbach conjecture holds true for it.
 * It interacts with the Number class to perform these checks.
 * UML Class Diagram: https://github.com/NahidHE/Java/blob/main/class_diagram.png
 * You may study from: https://www.geeksforgeeks.org/system-design/unified-modeling-language-uml-class-diagrams/
 */
import java.util.Scanner;

public class UML {
    public void displayInfo(int number) {
        Number num = new Number();
        num.number = number;

        System.out.println("Number: " + num.number);
        System.out.println("Is Even: " + num.isEven());
        System.out.println("Is Prime: " + num.isPrime());
        System.out.println("Is GoldBach Conjecture True: " + num.isGoldbach());
    }

    public static void main(String[] args) {
        UML uml = new UML();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.print("Enter a number: ");
            int inputNumber = scanner.nextInt();
            uml.displayInfo(inputNumber);

            if(inputNumber < 0) {
                System.out.println("Exiting...");
                break; // Exit the loop if a negative number is entered
            }
        }
        scanner.close();
    }
}
