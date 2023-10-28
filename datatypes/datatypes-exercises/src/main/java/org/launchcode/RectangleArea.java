package org.launchcode;
import java.util.Scanner;

public class RectangleArea {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Rectangle length:");
        Double length = input.nextDouble();

        System.out.println("Rectangle width:");
        Double width = input.nextDouble();

        double area = length * width;

        System.out.println("The area of your rectangle is " + area + ".");
        input.close();
    }
}
