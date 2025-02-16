package org.yourcompany.yourproject;
import java.util.Scanner;

public class Exercise_3_11 {

    public static int DaysInMonth(int month, int year) {

        if(month == 2) {
            if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return 29;
            } else {
                return 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {  

            System.out.print("Enter the month (1-12): ");
            int month = scanner.nextInt();
            System.out.print("Enter the year: ");
            int year = scanner.nextInt();

            int days = DaysInMonth(month, year);

            System.out.printf("Month %d of the year %d has %d days.", month, year, days);


        }
    }
    
}
