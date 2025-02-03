/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package org.yourcompany.yourproject;

 import java.util.Scanner;

 import static org.junit.jupiter.api.Assertions.assertEquals;
 import org.junit.jupiter.api.Test;



 /**
  *
  * @author sebas
  */

  // Start of the program
 public class Exercise_2_1 {

    public static double CelsiusToFahrenheit(double celsius) {
        return (9.0 / 5) * celsius + 32;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a degree in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = CelsiusToFahrenheit(celsius);

        System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit.");
    }

    public static class CelsiusToFahrenheitTest {

        @Test 
        public void ZeroCelius() {

            double result = CelsiusToFahrenheit(0);
            assertEquals(32.0, result, "0°C should be 32°F");

        }
        @Test
        public void testHundredCelsius() {
            double result = CelsiusToFahrenheit(100);
            assertEquals(212.0, result, "100°C should be 212°F");
        }

        @Test
        public void testNegativeFortyCelsius() {
            double result = CelsiusToFahrenheit(-40);
            assertEquals(-40.0, result, "-40°C should be -40°F");
        }

        @Test
        public void testThirtySevenCelsius() {
            double result = CelsiusToFahrenheit(37);
            assertEquals(98.6, result, 0.1, "37°C should be approximately 98.6°F");
        }
    }

 }
 // End of the program
 