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
        assertEquals(2, cal.add(1,1));
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

    @Test
    public void testDivide() {
        cal = new Calculator();
        assertEquals(2, cal.divide(4, 2));
        assertEquals(17, cal.divide(85, 5));
        assertEquals(45, cal.divide(90, 2));
        assertEquals(23, cal.divide(69, 3));
        assertNotEquals(10, cal.divide(30, 5));
        assertNotEquals(5, cal.divide(30, 2));
        assertNotEquals(76, cal.divide(10, 5));
        assertNotEquals(2, cal.divide(50, 2));
    }

    @Test
    public void testExponential() {
        cal = new Calculator();
        assertEquals(4, cal.exponential(2, 2));
        assertEquals(9, cal.exponential(3, 2));
        assertEquals(8, cal.exponential(2, 3));
        assertEquals(16, cal.exponential(2, 4));
        assertNotEquals(5, cal.exponential(2, 2));
        assertNotEquals(7, cal.exponential(3, 2));
        assertNotEquals(15, cal.exponential(2, 3));
        assertNotEquals(30, cal.exponential(2, 4));
    }

    @Test
    public void testModulo() {
        cal = new Calculator();
        assertEquals(0, cal.modulo(4, 2));
        assertEquals(0, cal.modulo(8, 2));
        assertEquals(1, cal.modulo(4, 3));
        assertEquals(2, cal.modulo(8, 3));
        assertNotEquals(1, cal.modulo(4, 2));
        assertNotEquals(1, cal.modulo(8, 2));
        assertNotEquals(0, cal.modulo(4, 3));
        assertNotEquals(0, cal.modulo(8, 3));
    }
}
