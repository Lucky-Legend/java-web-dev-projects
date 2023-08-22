package org.launchcode;
import java.util.Scanner;

public class StringSearch {
    public static void main (String[] args) {
        String aliceIntro = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: " +
                "once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, " +
                "‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?";
        Scanner input = new Scanner(System.in);

        System.out.println("Term to search for:");
        String term = input.nextLine();

        String lowIntro = aliceIntro.toLowerCase();
        String lowTerm = term.toLowerCase();

        boolean found = lowIntro.contains(lowTerm);
        int index = lowIntro.indexOf(lowTerm) + 1;
        int length = lowTerm.length();

        System.out.println("It is " + found + " that your term is in the first sentence of Alice in Wonderland.");
        System.out.println("Your term first appears as the number " + index + " term in the sentence.");
        System.out.println("You entered a term that is " + length + " characters long.");

        String alteredIntro = lowIntro.replace(lowTerm, "");
        System.out.println(alteredIntro);
    }
}
