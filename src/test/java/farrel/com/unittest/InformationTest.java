package farrel.com.unittest;

import org.junit.jupiter.api.*;

@DisplayName(value = "Information Test")
public class InformationTest {

    @Test
    @Tags(value = {
            @Tag(value = "one"),
            @Tag(value = "two")
    })
    @DisplayName(value = "This is test1")
    void test1(TestInfo testInfo) {
        System.out.println(testInfo.getDisplayName());
        System.out.println(testInfo.getTags());
        System.out.println(testInfo.getTestClass().orElse(null));
        System.out.println(testInfo.getTestMethod().orElse(null));
    }
}
