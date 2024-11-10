
/*Objective: Write a Java program that calculates the factorial of a number entered by the user.

Steps:

Prompt the user to enter a positive integer.
Use a loop to calculate the factorial of the number.
Display the result.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number;
        int factorial = 1;

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        number = Sc.nextInt();

        // Calculate factorial
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        System.out.println("The factorial of " + number + " is " + factorial);

    }
}