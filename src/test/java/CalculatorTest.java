import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {
    @Test
    void tenPlusFiveShouldEqualFifteen(){
        var calculator = new Calculator();
        assertEquals(15, calculator.add(10, 5));

    }
    @Test
    void tenTimesFiveShouldEqualFifty(){
        var calculator = new Calculator();
        assertEquals(50, calculator.multiply(10, 5));
    }
    @Test
    void tenMinusFiveShouldEqualFive(){
        var calculator = new Calculator();
        assertEquals(5, calculator.subtract(10, 5));
    }
}