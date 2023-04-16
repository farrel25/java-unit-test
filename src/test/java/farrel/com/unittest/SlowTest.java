package farrel.com.unittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

@Execution(value = ExecutionMode.CONCURRENT)
public class SlowTest {

    @Test
    @Timeout(value = 5)
    void testSlow1() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    @Timeout(value = 5)
    void testSlow2() throws InterruptedException {
        Thread.sleep(4_000);
    }

    @Test
    @Timeout(value = 5)
    void testSlow3() throws InterruptedException {
        Thread.sleep(4_000);
    }
}
