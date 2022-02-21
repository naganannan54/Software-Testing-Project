import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("Add two numbers")
    void add() {
        assertEquals(4, Calculator.add(2,2));
        assertEquals(13, Calculator.add(2,2,9));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(() -> assertEquals(8, Calculator.multiply(2,2,2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(8, Calculator.multiply(-2,-4)),
                () -> assertEquals(0, Calculator.multiply(1,0)));
    }
}