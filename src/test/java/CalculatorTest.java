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
        assertEquals(0, cal.add(-2, 2));
        assertEquals(6, cal.add(4, 2));
        assertEquals(9, cal.add(6, 3));
        assertEquals(-6, cal.add(-3, -3));
        assertNotEquals(-2, cal.add(4, -3));
        assertNotEquals(4, cal.add(5, 0));
        assertNotEquals(3, cal.add(3, 4));
        assertNotEquals(9, cal.add(-4, -5));
    }

    @Test
    public void testMultiply() {
        cal = new Calculator();
        assertEquals(4, cal.multiply(2, 2));
        assertEquals(-9, cal.multiply(-3, 3));
        assertEquals(15, cal.multiply(5, 3));
        assertEquals(1, cal.multiply(1, 1));
        assertEquals(0, cal.multiply(18977, 0));
        assertNotEquals(6, cal.multiply(2, 2));
        assertNotEquals(-9, cal.multiply(-3, -3));
        assertNotEquals(0, cal.multiply(12, 3));
        assertNotEquals(5, cal.multiply(2, 1));
    }

    @Test
    public void testSubtract() {
        cal = new Calculator();
        assertEquals(2, cal.subtract(4, 2));
        assertEquals(3, cal.subtract(10, 7));
        assertEquals(10, cal.subtract(100, 90));
        assertEquals(-1, cal.subtract(-3, -2));
        assertEquals(-25, cal.subtract(25, 50));
        assertNotEquals(10, cal.subtract(-3, -2));
        assertNotEquals(5, cal.subtract(5, 2));
        assertNotEquals(10, cal.subtract(100, 75));
        assertNotEquals(25, cal.subtract(25, 25));
    }

    /*@Test
    public void testDivide() {
        cal = new Calculator();
        assertEquals(2, cal.divide(4, 2));
        assertEquals(17, cal.divide(85, 5));
        assertEquals(44.5, cal.divide(89, 2));
        assertEquals(23, cal.divide(69, 3));
        assertNotEquals(10, cal.divide(30, 5));
        assertNotEquals(5, cal.divide(30, 2));
        assertNotEquals(76, cal.divide(10, 5));
        assertNotEquals(2, cal.divide(50, 2));
    }*/


        /*assertAll(() -> assertEquals(8, Calculator.multiply(2,2,2)),
                () -> assertEquals(-4, Calculator.multiply(2, -2)),
                () -> assertEquals(8, Calculator.multiply(-2,-4)),
                () -> assertEquals(0, Calculator.multiply(1,0)));*/

}
