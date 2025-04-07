package org.yourcompany.yourproject;

public class Exercise_5_7 {

    public static void main(String[] args) {

        double tuition = 10000;
        double annualIncrease = 0.05;
        int years = 10;
        double totalCost = 0;

        // Loop that goes from year 1 to years 10 of tuition 
        for (int i = 1; i <= years; i++) {
            tuition += tuition * annualIncrease;
        }
            
        //First printed message that states the tuition after 10 years.
        System.out.printf("Tuition after %d years: $%.2f\n", years, tuition);

        // Loop from 1 to 4 that goes from year 10 to year 13 and the total tuition cost after 4 years.
        for (int i = 1; i <= 4; i++) {

            totalCost += tuition;
            tuition += tuition * annualIncrease;
            
        }
        //Printed message that states the totla cost of 4 years of tuition.
        System.out.printf("Total cost of four years tuition between year 10 to year 13: $%.2f\n", totalCost);
    }
    
}
