package farrel.com.unittest;

import org.junit.jupiter.api.*;

//@TestMethodOrder(value = MethodOrderer.MethodName.class)
//@TestMethodOrder(value = MethodOrderer.Random.class)
//@TestMethodOrder(value = MethodOrderer.DisplayName.class)
@TestMethodOrder(value = MethodOrderer.OrderAnnotation.class)
@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class OrderedTest {

    private int counter = 0;

    @BeforeAll
    void beforeAll() {

    }

    @AfterAll
    void afterAll() {

    }

    @Test
    @Order(value = 1)
    void test3() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(value = 3)
    void test2() {
        counter++;
        System.out.println(counter);
    }

    @Test
    @Order(value = 2)
    void test1() {
        counter++;
        System.out.println(counter);
    }
}
