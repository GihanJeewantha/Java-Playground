/*Objective: Write a Java program that asks the user for two numbers, then adds them together and displays the result.

Steps:
Create a new Java file named SimpleCalculator.java.
Use the Scanner class to take input from the user.
Prompt the user to enter two integers.
Add the two numbers and display the result.*/
import java.util.Scanner;
public class Main {

    public static void main (String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Calculate the sum
        int sum = num1 + num2;

        // Display the result
        System.out.println("The sum is: " + sum);


    }
}