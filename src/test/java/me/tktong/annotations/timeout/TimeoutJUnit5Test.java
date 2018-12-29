package me.tktong.annotations.timeout;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;

class TimeoutJUnit5Test {
    @Test
    void timeoutTest() {
        Assertions.assertTimeout(Duration.ofMillis(10L), () -> someBusinessLogic(1000L));
    }

    private void someBusinessLogic(final long sleepDuration)
            throws InterruptedException{
        Thread.sleep(sleepDuration);
    }
}
