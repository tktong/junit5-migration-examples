package me.tktong.assertions.multiple;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertAllJunit5Test {
    @Test
    void someTest() {
        Assertions.assertAll("Some heading",
                () -> Assertions.assertFalse(true),
                () -> Assertions.assertEquals(1L, 3L),
                () -> Assertions.assertEquals("Some expected text", "Some other text")
        );
    }
}