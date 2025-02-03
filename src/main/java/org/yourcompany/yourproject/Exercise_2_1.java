package org.yourcompany.yourproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_2_1 {
    // Celsius to Fahrenheit conversion
    public static double CelsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    //Main function
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {  
            //Input system which asks for a celsius value.
            System.out.print("Enter a degree in Celsius: ");
            
            // Variables
            double celsius = scanner.nextDouble();
            double fahrenheit = CelsiusToFahrenheit(celsius);
            DecimalFormat df = new DecimalFormat("#.0");

            //Printed message.
            System.out.println(celsius + " Celsius is " + df.format(fahrenheit) + " Fahrenheit.");
        }
        
    }
}
