import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {
    public Calculator cal;

    @Test
    public void testAddMultDiv() {
        cal = new Calculator();

        assertEquals(8, cal.add(cal.multiply(2,2), cal.divide(8,2)));
        assertEquals(10, cal.add(cal.multiply(3,2), cal.divide(8,2)));
        assertEquals(15, cal.add(cal.multiply(5,2), cal.divide(15,3)));
        assertEquals(2, cal.add(cal.multiply(1,1), cal.divide(2,2)));
        assertNotEquals(10, cal.add(cal.multiply(3,2), cal.divide(10,2)));
        assertNotEquals(17, cal.add(cal.multiply(3,4), cal.divide(10,5)));
        assertNotEquals(28, cal.add(cal.multiply(3,2), cal.divide(18,2)));
    }
}
