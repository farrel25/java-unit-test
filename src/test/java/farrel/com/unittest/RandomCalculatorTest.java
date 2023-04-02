package farrel.com.unittest;

import farrel.com.unittest.resolver.RandomParameterResolver;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

//@ExtendWith(value = RandomParameterResolver.class)
@Extensions(value = {
        @ExtendWith(value = RandomParameterResolver.class)
})
public class RandomCalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    void testRandom(Random random) {
        int a = random.nextInt();
        int b = random.nextInt();

        Integer result = calculator.add(a, b);
        int expected = a + b;

        Assertions.assertEquals(expected, result);
    }
}
