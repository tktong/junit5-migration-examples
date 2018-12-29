package me.tktong.assertions.logical;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit4 uses assertion methods from {@link org.junit.Assert}. Note that in JUnit4, the failure message parameter comes
 * prior to the condition.
 */
public class AssertTrueJUnit4Test {
    @Test
    public void assertTrue() {
        Assert.assertTrue(true);
    }

    @Test
    public void assertTrueWithMessage() {
        Assert.assertTrue("My message", true);
    }
}
