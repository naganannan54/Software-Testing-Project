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
    public void testForRecording() {
        cal = new Calculator();
        assertEquals(4, cal.add(3,1));
    }

    @Test
    public void testAdd() {
        cal = new Calculator();
        assertEquals(0, cal.add(-2,2));
        assertEquals(6, cal.add(4,2));
        assertEquals(9, cal.add(6,3));
        assertEquals(-6, cal.add(-3,-3));
        assertNotEquals(-2, cal.add(4,-3));
        assertNotEquals(4, cal.add(5, 0));
        assertNotEquals(3, cal.add(3,4));
        assertNotEquals(9, cal.add(-4,-5));
    }

    @Test
    public void testMultiply() {
        cal = new Calculator();
        assertEquals(4, cal.multiply(2,2));
        assertEquals(-9, cal.multiply(-3,3));
        assertEquals(15, cal.multiply(5,3));
        assertEquals(1, cal.multiply(1,1));
        assertEquals(0, cal.multiply(18977,0));
        assertNotEquals(6, cal.multiply(2,2));
        assertNotEquals(-9, cal.multiply(-3,-3));
        assertNotEquals(0, cal.multiply(12,3));
        assertNotEquals(5, cal.multiply(2,1));
    }
}