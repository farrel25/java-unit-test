package farrel.com.unittest;

import org.junit.jupiter.api.*;

import java.util.LinkedList;
import java.util.Queue;

@DisplayName(value = "A Queue")
public class QueueTest {

    private Queue<String> queue;

    @Nested
    @DisplayName("When New")
    public class whenNew {

        @BeforeEach
        void setUp() {
            queue = new LinkedList<>();
        }

        @Test
        @DisplayName(value = "When offer, size must be 1")
        void offerNewData() {
            queue.offer("Farrel");
            Assertions.assertEquals(1, queue.size());
        }

        @Test
        @DisplayName(value = "When offer 2 data, size must be 2")
        void offerMoreData() {
            queue.offer("Farrel");
            queue.offer("Putra");
            Assertions.assertEquals(2, queue.size());
        }
    }
}
