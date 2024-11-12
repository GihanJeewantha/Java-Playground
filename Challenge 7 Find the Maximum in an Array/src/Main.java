/*Objective: Write a Java program that finds the largest number in an array of integers.

Steps:

Define an array of integers.
Use a loop to iterate through the array and find the maximum value.
Display the maximum value.*/


public class Main {
    public static void main(String[] args) {
        int[] numbers = {45, 72, 12, 92, 34};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println("The largest number in the array is: " + max);
    }
}