package farrel.com.unittest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(value = MethodOrderer.MethodName.class)
//@TestMethodOrder(value = MethodOrderer.Random.class)
//@TestMethodOrder(value = MethodOrderer.DisplayName.class)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
public class OrderedTest {

    @Test
    @Order(value = 1)
    void test3() {

    }

    @Test
    @Order(value = 3)
    void test2() {

    }

    @Test
    @Order(value = 2)
    void test1() {

    }
}
