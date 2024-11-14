
/*Problem: Write a Java program that calculates the factorial of a given non-negative integer n.

The factorial of a number n, represented as n!, is the product of all positive integers less than or equal to n. For example:

Instructions:

The program should take an integer n as input.
If n is 0, the program should return 1 as the factorial of 0 is 1.
For values greater than 0, calculate the factorial by multiplying all integers from 1 to n.
Print the result as "Factorial of n is result".
Example:

Input: 5 Output: "Factorial of 5 is 120"
Input: 3 Output: "Factorial of 3 is 6"*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();

        // Calculate and print the factorial
        if (n >= 0) {
            System.out.println("Factorial of " + n + " is " + calculateFactorial(n));
        } else {
            System.out.println("Please enter a non-negative integer.");
        }

        scanner.close();
    }

    public static long calculateFactorial(int n) {
        long factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }
}