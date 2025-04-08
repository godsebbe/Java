package org.yourcompany.yourproject;

public class Exercise_6_2 {
    // Method to compute the sum of digits in an integer
    public static int sumDigits(long n) {
        int sum = 0;

        // Makes sure the number is positive
        n = Math.abs(n);
        // loop to extract and add digits.
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }

    // Main method
    public static void main(String[] args) {
        long testNumber = 234;
        int result = sumDigits(testNumber);
        System.out.printf("The sum of digits in %d is %d", testNumber, result);
    }
}
