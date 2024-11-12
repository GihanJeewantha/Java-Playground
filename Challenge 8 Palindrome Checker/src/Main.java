/*Objective: Write a Java program that checks if a word entered by the user is a palindrome (a word that reads the same forward and backward).

Steps:

Prompt the user to enter a word.
Check if the word reads the same backward using a loop or by reversing the string.
Display whether it is a palindrome.*/
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);

        System.out.println("Enter Text: ");
        String txt = Sc.nextLine();
        String reversed = "";

        for (int i = txt.length() - 1; i >= 0; i--) {
            reversed += txt.charAt(i);
        }

        // Check if the word is a palindrome
        if (txt.equalsIgnoreCase(reversed)) {
            System.out.println(txt + " is a palindrome.");
        } else {
            System.out.println(txt + " is not a palindrome.");
        }

    }


}