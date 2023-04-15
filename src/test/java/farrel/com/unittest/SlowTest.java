package farrel.com.unittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class SlowTest {

    @Test
    @Timeout(value = 5)
    void testSlow() throws InterruptedException {
        Thread.sleep(10_000);
    }
}
