/*Problem: Write a Java program that checks whether a given number is prime or not.

A prime number is a number greater than 1 that has no divisors other than 1 and itself.

Instructions:

The program should take an integer as input.
It should check whether the number is prime or not.
If the number is prime, print "The number is prime".
If the number is not prime, print "The number is not prime".
You can assume the input will always be a positive integer.*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is prime
        if (isPrime(number)) {
            System.out.println("The number is prime");
        } else {
            System.out.println("The number is not prime");
        }

        scanner.close();
    }

    public static boolean isPrime(int number) {
        // If number is less than or equal to 1, it's not prime
        if (number <= 1) {
            return false;
        }

        // Check divisibility up to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;  // Number is divisible by i, so it's not prime
            }
        }

        return true;  // Number is prime
    }
}