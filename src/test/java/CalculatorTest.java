import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    public Calculator cal;

    @Test
    public void add() {
        cal = new Calculator();
        assertEquals(4, cal.add(2,2));
    }

    @Test
    public void multiply() {
        cal = new Calculator();
        assertEquals(5, cal.multiply(2,2));

        /*assertAll(() -> assertEquals(8, Calculator.multiply(2,2,2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(8, Calculator.multiply(-2,-4)),
                () -> assertEquals(0, Calculator.multiply(1,0)));*/
    }
}