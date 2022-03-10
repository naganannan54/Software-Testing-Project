import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class IntegrationTest {
    public Calculator cal;

    @Test
    public void testAddMultDiv() {
        cal = new Calculator();

        assertEquals(8, cal.add(cal.multiply(2,2), cal.divide(8,2)));
    }
}
