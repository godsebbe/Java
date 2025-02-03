package org.yourcompany.yourproject;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
// Test cases
public class GratuityCalculatorTest {
// Test case 1
    @Test
    public void GratuityandTotalOne() {

        double subtotal = 50.0;
        double gratuityRate = 10.0;
        double expectedGratuity = 5.0;
        double expectedTotal = 55.0;

        double gratuity = Exercise_2_6.GratuityRate(subtotal, gratuityRate);
        double total = Exercise_2_6.Total(subtotal, gratuity);

        assertEquals(expectedGratuity, gratuity, 0.01, "Gratuity should be $5.0");
        assertEquals(expectedTotal, total, 0.01, "Total should be $55.0");

    }
    // Test case 2
    @Test
    public void GratuityandTotalTwo() {

        double subtotal = 100.0;
        double gratuityRate = 20.0;
        double expectedGratuity = 20.0;
        double expectedTotal = 120.0;

        double gratuity = Exercise_2_6.GratuityRate(subtotal, gratuityRate);
        double total = Exercise_2_6.Total(subtotal, gratuity);

        assertEquals(expectedGratuity, gratuity, 0.01, "Gratuity should be $20.0");
        assertEquals(expectedTotal, total, 0.01, "Total should be $120.0");

    }
    // Test case 3
    @Test
    public void GratuityandTotalThree() {

        double subtotal = 25.0;
        double gratuityRate = 15.0;
        double expectedGratuity = 3.75;
        double expectedTotal = 28.75;

        double gratuity = Exercise_2_6.GratuityRate(subtotal, gratuityRate);
        double total = Exercise_2_6.Total(subtotal, gratuity);

        assertEquals(expectedGratuity, gratuity, 0.01, "Gratuity should be $3.75");
        assertEquals(expectedTotal, total, 0.01, "Total should be $28.75");

    }
    // Test case 4
    @Test
    public void GratuityandTotalFour() {

        double subtotal = 80.0;
        double gratuityRate = 12.5;
        double expectedGratuity = 10.0;
        double expectedTotal = 90.0;

        double gratuity = Exercise_2_6.GratuityRate(subtotal, gratuityRate);
        double total = Exercise_2_6.Total(subtotal, gratuity);

        assertEquals(expectedGratuity, gratuity, 0.01, "Gratuity should be $10.0");
        assertEquals(expectedTotal, total, 0.01, "Total should be $90.0");

    }
    
}
