package org.launchcode;
import java.util.Scanner;
public class MilesPerGallon {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gallons of gas used:");
        Double gallons = input.nextDouble();

        System.out.println("Miles Driven:");
        Double miles = input.nextDouble();

        double mpg = miles / gallons;

        System.out.println("Your miles per gallon is " + mpg + ".");
    }
}
