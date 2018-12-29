package me.tktong.annotations.timeout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class TimeoutJUnit5Test {
    private static final String MESSAGE = "My message";
    private static final String RETURN_VALUE = "Some return value";
    private static final Duration TIMEOUT_DURATION = Duration.ofMillis(10L);

    @Test
    void assertTimeout() {
        Assertions.assertTimeout(TIMEOUT_DURATION, () -> someBusinessLogic(1000L));
    }

    @Test
    void assertTimeoutWithMessage() {
        Assertions.assertTimeout(TIMEOUT_DURATION, () -> someBusinessLogic(1000L), MESSAGE);
    }

    @Test
    void assertTimeoutWithMessageSupplier() {
        Assertions.assertTimeout(TIMEOUT_DURATION, () -> someBusinessLogic(1000L), () -> MESSAGE);
    }

    @Test
    void assertTimeoutWithThrowableSupplier() {
        final String result = Assertions.assertTimeout(TIMEOUT_DURATION, () -> someBusinessLogicWithReturnValue(100L));
        Assertions.assertEquals(RETURN_VALUE, result);
    }

    @Test
    void assertTimeoutWithThrowableSupplierAndMessage() {
        final String result = Assertions.assertTimeout(TIMEOUT_DURATION, () -> someBusinessLogicWithReturnValue(100L), MESSAGE);
        Assertions.assertEquals(RETURN_VALUE, result);
    }

    @Test
    void assertTimeoutWithThrowableSupplierAndMessageSupplier() {
        final String result = Assertions.assertTimeout(TIMEOUT_DURATION, () -> someBusinessLogicWithReturnValue(100L), () -> MESSAGE);
        Assertions.assertEquals(RETURN_VALUE, result);
    }

    private void someBusinessLogic(final long sleepDuration)
            throws InterruptedException{
        Thread.sleep(sleepDuration);
    }

    private String someBusinessLogicWithReturnValue(final long sleepDuration)
            throws InterruptedException{
        Thread.sleep(sleepDuration);
        return RETURN_VALUE;
    }
}
