package me.tktong.assertions.logical;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AssertFalseJUnit5Test {
    private static final String MESSAGE = "My message";

    @Test
    void assertFalse() {
        Assertions.assertFalse(false);
    }

    @Test
    void assertFalseWithBooleanSupplier() {
        Assertions.assertFalse(() -> false);
    }

    @Test
    void assertFalseWithBooleanSupplierAndMessage() {
        Assertions.assertFalse(() -> false, MESSAGE);
    }


    @Test
    void assertFalseWithBooleanSupplierAndMessageSupplier() {
        Assertions.assertFalse(() -> false, () -> MESSAGE);
    }

    @Test
    void assertFalseWithMessage() {
        Assertions.assertFalse(false, MESSAGE);
    }

    @Test
    void assertFalseWithMessageSupplier() {
        Assertions.assertFalse(false, () -> MESSAGE);
    }
}