package org.yourcompany.yourproject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercise_2_6 {
    
    // Calculate the Gratuity
    public static double GratuityRate(double subtotal, double gratuityRate) {
        return subtotal * (gratuityRate / 100);
    }
    // Calculate the Total
    public static double Total(double subtotal, double gratuity) {
        return subtotal + gratuity;
    }

    // Main function
    public static void main(String[] args) {

            try (Scanner scanner = new Scanner(System.in)) {  
            //Input system which asks for a subtotal value.
            System.out.print("Enter the subtotal: ");
            double subtotal = scanner.nextDouble();
            //Followup Input system which asks for a gratuity rate value. Works with or without percentage symbol as in 5 or 5%
            System.out.print("Enter the gratuity rate as a percentage: ");

            String gratuityInput = scanner.next();
            // Removes the percentage symbol if present from the input.
            if(gratuityInput.contains("%")) {
                gratuityInput = gratuityInput.replace("%", "");
            }
            // Converts the string from gratuityInput to a floating-point number.
            double gratuityRate = Double.parseDouble(gratuityInput);

            //Variables
            double gratuity = GratuityRate(subtotal, gratuityRate);
            double total = Total(subtotal, gratuity);
            DecimalFormat df = new DecimalFormat("#.00");
            //Printed messages
            System.out.println("Gratuity: $" + df.format(gratuity));
            System.out.println("Total: $" + df.format(total));
        }
    }
}
