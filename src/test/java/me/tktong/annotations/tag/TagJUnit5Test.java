package me.tktong.annotations.tag;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

/**
 * JUnit5 uses string tags instead of using an interface in JUnit 4 to categorize different types of tests.
 */
@Tag("someTag")
class TagJUnit5Test {
    @Test
    void someTest(){}
}
