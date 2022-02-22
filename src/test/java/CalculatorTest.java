import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    public Calculator cal;

    @Test
    public void testCal() {
        cal = new Calculator();
        assertNotEquals(cal, null);
    }

    @Test
    public void testAdd() {
        cal = new Calculator();
        assertEquals(0, cal.add(-2,2));
        assertEquals(6, cal.add(4,2));
        assertEquals(6, cal.add(6,0));
    }

    @Test
    public void testMultiply() {
        cal = new Calculator();
        assertEquals(4, cal.multiply(2,2));

        /*assertAll(() -> assertEquals(8, Calculator.multiply(2,2,2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(8, Calculator.multiply(-2,-4)),
                () -> assertEquals(0, Calculator.multiply(1,0)));*/
    }
}