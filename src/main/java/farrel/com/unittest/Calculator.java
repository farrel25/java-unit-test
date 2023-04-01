package farrel.com.unittest;

import java.io.IOException;

public class Calculator {

    public Integer add(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }

    public Integer divide(Integer number, Integer divisor) {
        if (divisor == 0) {
            throw new IllegalArgumentException("Can not divide by zero");
        }
        return number/divisor;
    }
}
