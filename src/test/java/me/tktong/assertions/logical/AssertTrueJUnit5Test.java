package me.tktong.assertions.logical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * JUnit5 uses assertion methods from {@link org.junit.jupiter.api.Assertions}. Also note that in JUnit5, the message
 * parameter comes after the condition parameter.
 */
class AssertTrueJUnit5Test {
    private static final String MESSAGE = "My message";

    @Test
    void assertTrue() {
        Assertions.assertTrue(true);
    }

    @Test
    void assertTrueWithBooleanSupplier() {
        Assertions.assertTrue(() -> true);
    }

    @Test
    void assertTrueWithBooleanSupplierAndMessage() {
        Assertions.assertTrue(() -> true, MESSAGE);
    }


    @Test
    void assertTrueWithBooleanSupplierAndMessageSupplier() {
        Assertions.assertTrue(() -> true, () -> MESSAGE);
    }

    @Test
    void assertTrueWithMessage() {
        Assertions.assertTrue(true, MESSAGE);
    }

    @Test
    void assertTrueWithMessageSupplier() {
        Assertions.assertTrue(true, () -> MESSAGE);
    }
}