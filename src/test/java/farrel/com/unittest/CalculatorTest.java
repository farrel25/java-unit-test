package farrel.com.unittest;

import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddSuccess() {
        Integer result = calculator.add(10, 20);
    }
}
