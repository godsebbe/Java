package org.yourcompany.yourproject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
// Test cases
public class CelsiusToFahrenheitTest {
    //Test case 1
    @Test
    public void zeroCelsius() {
        double result = Exercise_2_1.CelsiusToFahrenheit(0);
        assertEquals(32.0, result, "0°C should be 32°F");
    }
//Test case 2
    @Test
    public void hundredCelsius() {
        double result = Exercise_2_1.CelsiusToFahrenheit(100);
        assertEquals(212.0, result, "100°C should be 212°F");
    }
//Test case 3
    @Test
    public void negativeFortyCelsius() {
        double result = Exercise_2_1.CelsiusToFahrenheit(-40);
        assertEquals(-40.0, result, "-40°C should be -40°F");
    }
//Test case 4
    @Test
    public void thirtySevenCelsius() {
        double result = Exercise_2_1.CelsiusToFahrenheit(37);
        assertEquals(98.6, result, 0.1, "37°C should be approximately 98.6°F");
    }
}
