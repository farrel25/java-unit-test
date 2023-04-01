package farrel.com.unittest;

import farrel.com.unittest.generator.SimpleDisplayNameGenerator;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@DisplayName("Test For Calculator Class")
@DisplayNameGeneration(value = SimpleDisplayNameGenerator.class)
public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Before All");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("After All");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each");
    }

    @Test
    //@DisplayName("Test Success Scenario of method add(Integer, Integer)")
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

    @Test
    @Disabled
    public void testComingSoon() {

    }
}
