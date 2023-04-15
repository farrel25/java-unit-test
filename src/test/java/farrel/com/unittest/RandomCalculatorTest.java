package farrel.com.unittest;

import farrel.com.unittest.resolver.RandomParameterResolver;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.List;
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

    @DisplayName(value = "Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @ValueSource(ints = {1,2,3,4,5,6,7,8,45,34,56})
    void testWithParameter(int value) {
        var expected = value + value;
        var result = calculator.add(value, value);

        Assertions.assertEquals(expected, result);
    }

    public static List<Integer> parameterSource(){
        return List.of(1,2,34,56,33,65,67,35);
    }

    @DisplayName(value = "Test Calculator")
    @ParameterizedTest(name = "{displayName} dengan parameter {0}")
    @MethodSource(value = "parameterSource")
    void testWithMethodSource(Integer value) {
        var expected = value + value;
        var result = calculator.add(value, value);

        Assertions.assertEquals(expected, result);
    }
}
