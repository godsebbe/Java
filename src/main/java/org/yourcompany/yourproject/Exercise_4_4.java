package org.yourcompany.yourproject;
import java.util.Scanner;

public class Exercise_4_4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // scanner

        System.out.print("Enter the side: "); // input prompt
        double s = input.nextDouble();
        double area = (6 * Math.pow(s, 2)) / (4 * Math.tan(Math.PI / 6)); // area calculation
        System.out.printf("The are of the hexagon is %.2f\n", area); //printed message
        input.close(); //closing the scanner.
    }
    
}
