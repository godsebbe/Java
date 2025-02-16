package org.yourcompany.yourproject;
import java.util.Scanner;

public class Exercise_3_6 {
    public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {  

        System.out.print("Enter your weight in pounds: ");
        double weight = scanner.nextDouble();

        System.out.print("Enter feet: ");
        int feet = scanner.nextInt();

        System.out.print("Enter inches: ");
        int inches = scanner.nextInt();

        int totalInches = feet * 12 + inches;
        //Calculating the BMI
        double bmi = (weight / (totalInches * totalInches)) * 703;
        //Creating a BMI string value.
        String bmiValue;
        // Checking if bmi is lower than 18.5, 24.9, 29.9, or higher than both and gives the string bmiValue a value such as underweight or normal for example.
        if(bmi < 18.5) {
            bmiValue = "Underweight";
        } else if (bmi < 24.9) {
            bmiValue = "Normal";
        } else if (bmi < 29.9) {
            bmiValue = "Overweight";
        } else {
            bmiValue = "Obese";
        }

        System.out.println("BMI is " + bmi + "\nBMI category: " + bmiValue);



    }
}
}
