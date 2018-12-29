package me.tktong.annotations.timeout;

import org.junit.Test;

public class TimeoutJUnit4Test {
    @Test(timeout = 10L)
    public void timeoutTest()
            throws InterruptedException{
        Thread.sleep(1000L);
    }
}
