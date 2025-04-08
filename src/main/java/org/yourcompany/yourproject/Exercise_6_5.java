package org.yourcompany.yourproject;

import java.util.Scanner;

public class Exercise_6_5 {

    // Method to display numbers in increasing order
    public static void SortedNumbers(double num1, double num2, double num3) {
        
        if(num1 <= num2 && num1 <= num3) {
            if (num2 <= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }
        } else if (num2 <= num1 && num2 <= num3) {
            if(num1 <= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }
        } else {
            if (num1 <= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }
    }
// Main method for user input
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompts the user to enter three numbers
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        // Call the method to display numbers in increasing order
        SortedNumbers(num1, num2, num3);
        scanner.close();

    }
    
}
