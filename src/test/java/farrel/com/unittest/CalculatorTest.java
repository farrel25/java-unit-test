package farrel.com.unittest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        Integer result = calculator.add(10, 20);

        // if we don't use assertions, we can user use if else, but it's not recommended
//        if (result != 30) {
//            throw new RuntimeException("Test gagal");
//        }
        assertEquals(30, result);
    }

    @Test
    public void testDivideSuccess() {
        Integer result = calculator.divide(10, 2);
        assertEquals(5, result);
    }

    @Test
    public void testDivideFailed() {
        assertThrows(
                IllegalArgumentException.class,
                () -> calculator.divide(10, 0)
        );
    }
}
