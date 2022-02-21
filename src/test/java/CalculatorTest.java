import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    public void add() {
        assertEquals(4, Calculator.add(2,2));
        assertEquals(13, Calculator.add(2,2,9));
        assertEquals(1, Calculator.add(2,2,-3));
        assertEquals(8, Calculator.add(3,5));
    }

    @Test
    @DisplayName("Multiply two numbers")
    public void multiply() {
        assertAll(() -> assertEquals(8, Calculator.multiply(2,2,2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(8, Calculator.multiply(-2,-4)),
                () -> assertEquals(0, Calculator.multiply(1,0)));
    }
}