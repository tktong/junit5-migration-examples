package me.tktong.annotations.disable;


import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

/**
 * JUnit 5 uses the annotation {@link org.junit.jupiter.api.Disabled} instead at the test-class level or test-method level.
 */
@Disabled
class DisabledJUnit5Test {
    @Test
    void disabledTest(){}
}
