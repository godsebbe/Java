package org.yourcompany.yourproject;

public class Exercise_5_4 {

    public static void main(String[] args) {
        
        System.out.println("Miles\tKilometers");
        // Loop from 1 to 10.
        for (int miles = 1; miles <= 10; miles++) {

            //Converter from Miles to Kilometers
            double kilometers = miles * 1.609;
            //Printed messages, excluding the first printed message that displays Miles and Kilometers which is above the loop code.
            System.out.printf("%d\t%.3f\n", miles, kilometers);
            
        }
    }
    
}
