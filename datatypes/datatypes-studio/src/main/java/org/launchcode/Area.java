package org.launchcode;
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a radius:");

        if (input.hasNextDouble()) {
            double radius = input.nextDouble();
            if (radius < 0) {
                System.out.println("Error: Invalid input.");
            } else {
                double area = Circle.getArea(radius);
                System.out.println("The area of a circle with the radius of " + radius + " is: " + '\n' + area);
            }
        } else if (input.next().isEmpty()) {
            System.out.println("Error: Invalid input.");
        } else {
            System.out.println("Error: Invalid input.");
        }
        input.close();
    }
}
