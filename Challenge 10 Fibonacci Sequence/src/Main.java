
/*Problem: Write a Java program that generates the Fibonacci sequence up to a given number n.

The Fibonacci sequence starts with 0, 1, and each subsequent number is the sum of the previous two numbers. For example, the sequence for the first 10 numbers is: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

Instructions:

The program should take an integer n as input (the number of terms to generate).
It should then print the first n numbers of the Fibonacci sequence.
The Fibonacci sequence starts with 0 and 1 as the first two numbers.
Ensure that the program handles both small and large values for n.*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Generate and print the Fibonacci sequence up to n terms
        printFibonacci(n);

        scanner.close();
    }

    public static void printFibonacci(int n) {
        // Handle edge cases for n less than or equal to 0
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int first = 0, second = 1;

        // Print the first Fibonacci number
        if (n >= 1) {
            System.out.print(first);
        }

        // Print the rest of the Fibonacci sequence
        for (int i = 2; i <= n; i++) {
            System.out.print(", " + second);
            // Update the first and second numbers to the next ones in the sequence
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println(); // Move to the next line after printing the sequence
    }
}