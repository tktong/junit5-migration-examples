package me.tktong.assertions.fail;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FailJUnit5Test {
    @Test
    void someTestToFail() {
        Assertions.fail();
    }

    @Test
    void someTestToFailWithMessage() {
        Assertions.fail("My message");
    }

    @Test
    void someTestToFailWithMessageSupplier() {
        Assertions.fail(() -> "My message");
    }

    @Test
    void someTestToFailWithThrowable() {
        Assertions.fail(new RuntimeException());
    }

    @Test
    void someTestToFailWithThrowableAndMessage() {
        Assertions.fail("My message", new RuntimeException());
    }
}
