package me.tktong.annotations.timeout;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class TimeoutRuleJUnit4Test {
    @Rule
    public Timeout timeout = Timeout.millis(10L);

    @Test
    public void timeoutTest()
            throws InterruptedException{
        Thread.sleep(1000L);
    }
}
