package farrel.com.unittest;

import farrel.com.unittest.resolver.RandomParameterResolver;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.extension.Extensions;

@Extensions(value = {
        @ExtendWith(value = RandomParameterResolver.class)
})
public class AbstractCalculatorTest {

    protected final Calculator calculator = new Calculator();

    @BeforeEach
    void setUp() {
        System.out.println("Before Each");
    }
}
