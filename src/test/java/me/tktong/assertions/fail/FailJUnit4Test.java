package me.tktong.assertions.fail;

import org.junit.Assert;
import org.junit.Test;

public class FailJUnit4Test {
    @Test
    public void someTestToFail() {
        Assert.fail();
    }

    @Test
    public void someTestToFailWithMessage() {
        Assert.fail("My message");
    }
}
