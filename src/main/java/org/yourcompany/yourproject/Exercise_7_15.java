package org.yourcompany.yourproject;

import java.util.Scanner;

public class Exercise_7_15 {

    // method to eliminate duplicates from the array
    public static int[] eliminateDuplicates(int[] list) {
        
        int[] temp = new int[list.length];
        int size = 0;

        for (int i = 0; i < list.length; i++) {
            boolean isDuplicate = false;
            // checks for duplicate number
            for (int j = 0; j < size; j++) {
                if (temp[j] == list[i]) {
                    isDuplicate = true;
                    break;
                }
            }
            
            if (!isDuplicate) {
                temp[size] = list[i];
                size++;
            }
        }

        
        int[] result = new int[size];
        for (int i = 0; i < size; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ten numbers recorded by the user.
        System.out.println("Enter ten numbers:");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }

        // eliminates duplicates
        int[] distinctNumbers = eliminateDuplicates(numbers);

        
        System.out.print("The distinct numbers are: ");
        for (int num : distinctNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
