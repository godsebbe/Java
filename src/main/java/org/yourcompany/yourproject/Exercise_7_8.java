package org.yourcompany.yourproject;
import java.util.Scanner;

public class Exercise_7_8 {
    
        // method to calculate average of int array
        public static int average(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum / array.length; // returns the int average
        }
    
        // method to calculate average of double array
        public static double average(double[] array) {
            double sum = 0;
            for (double num : array) {
                sum += num;
            }
            return sum / array.length; // returns the double average
        }
    
        // Main function
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            double[] doubleArray = new double[10];
    
            System.out.println("Enter ten double values:");
            for (int i = 0; i < doubleArray.length; i++) {
                doubleArray[i] = scanner.nextDouble(); // scanner loop 10 times.
            } 
    
            double avg = average(doubleArray);
            System.out.println("The average value is: " + avg);
    
            scanner.close();
        }

}
