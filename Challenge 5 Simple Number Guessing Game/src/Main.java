//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*Objective: Write a Java program that generates a random number between 1 and 10 and lets the user guess it. If the guess is correct, congratulate the user; if not, reveal the correct answer.

Steps:

Use Random to generate a random number between 1 and 10.
Prompt the user to guess the number.
Use an if statement to check if the guess is correct, and display the appropriate message.*/
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 10
        int numberToGuess = random.nextInt(10) + 1;

        System.out.print("Guess a number between 1 and 10: ");
        int userGuess = scanner.nextInt();

        // Check if the guess is correct
        if (userGuess == numberToGuess) {
            System.out.println("Congratulations! You guessed it right.");
        } else {
            System.out.println("Sorry, the correct number was " + numberToGuess + ".");
        }
    }
}