package farrel.com.unittest;

import farrel.com.unittest.resolver.RandomParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

import java.util.Random;

//@ExtendWith(value = RandomParameterResolver.class)
//@Extensions(value = {
//        @ExtendWith(value = RandomParameterResolver.class)
//})
public class RandomCalculatorTest extends AbstractCalculatorTest {

    //private final Calculator calculator = new Calculator();

    @Test
    void testRandom(Random random) {
        int a = random.nextInt();
        int b = random.nextInt();

        Integer result = calculator.add(a, b);
        int expected = a + b;

        Assertions.assertEquals(expected, result);
    }

    @DisplayName(value = "Test random calculator")
    @RepeatedTest(
            value = 10,
            //name = "{displayName} ke {currentRepetition} dari {totalRepetitions}"
            name = "{displayName}"
    )
    void testRandomRepeat(TestInfo testInfo, Random random, RepetitionInfo repetitionInfo) {
        System.out.println(
                testInfo.getDisplayName() + " ke " + repetitionInfo.getCurrentRepetition() + " dari " + repetitionInfo.getTotalRepetitions()
        );

        int a = random.nextInt();
        int b = random.nextInt();

        Integer result = calculator.add(a, b);
        int expected = a + b;

        Assertions.assertEquals(expected, result);
    }
}
