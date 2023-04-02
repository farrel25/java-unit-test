package farrel.com.unittest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

public class ConditionTest {

    @Test
    void testSystemProperties() {
        System.getProperties().forEach((key, value) -> System.out.println(key + ": " + value));
    }

    @Test
    @EnabledOnOs(value = {OS.WINDOWS})
    void testRunOnlyOnWindows() {}

    @Test
    @DisabledOnOs(value = {OS.WINDOWS})
    void testDisabledOnWindows() {}

    @Test
    @EnabledOnJre(value = {JRE.JAVA_8})
    void testEnabledOnJava8() {

    }

    @Test
    @DisabledOnJre(value = {JRE.JAVA_8})
    void testDisabledOnJava8() {

    }

    @Test
    @EnabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testEnabledOnJava11To17() {}

    @Test
    @DisabledForJreRange(min = JRE.JAVA_11, max = JRE.JAVA_17)
    void testDisabledOnJava11To17() {}

    @Test
    //@EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    @EnabledIfSystemProperties(value = {
            @EnabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testEnabledOnJavaVendorOracle() {

    }

    @Test
    //@DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    @DisabledIfSystemProperties(value = {
            @DisabledIfSystemProperty(named = "java.vendor", matches = "Oracle Corporation")
    })
    void testDisabledOnJavaVendorOracle() {

    }

    @Test
    @EnabledIfEnvironmentVariables(
            @EnabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testEnabledOnProfileDev(){}

    @Test
    @DisabledIfEnvironmentVariables(
            @DisabledIfEnvironmentVariable(named = "PROFILE", matches = "DEV")
    )
    void testDisabledOnProfileDev(){}
}
