package me.tktong.info;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Set;

@Tag("myTestClassTag")
@DisplayName("JUnit 5 test demonstrating TestInfo")
class TestInfoJUnit5Test {
    TestInfoJUnit5Test(final TestInfo testInfo) {
        final String displayName = testInfo.getDisplayName();
        Assertions.assertEquals("JUnit 5 test demonstrating TestInfo", displayName);

        final Set<String> tags = testInfo.getTags();
        Assertions.assertNotNull(tags);
        Assertions.assertEquals(1, tags.size());
        Assertions.assertTrue(tags.contains("myTestClassTag"));
    }

    @BeforeEach
    void before(final TestInfo testInfo) {
        final String displayName = testInfo.getDisplayName();
        Assertions.assertEquals("My test method", displayName);
    }

    @Test
    @Tag("myTestMethodTag")
    @DisplayName("My test method")
    void someTest(final TestInfo testInfo) {
        final String displayName = testInfo.getDisplayName();
        Assertions.assertEquals("My test method", displayName);

        final Set<String> tags = testInfo.getTags();
        Assertions.assertNotNull(tags);
        Assertions.assertEquals(2, tags.size());
        Assertions.assertTrue(tags.contains("myTestClassTag"));
        Assertions.assertTrue(tags.contains("myTestMethodTag"));
    }
}
