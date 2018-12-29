package me.tktong.assertions.logical;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit4 uses assertion methods from {@link org.junit.Assert}. Note that in JUnit4, the failure message parameter comes
 * prior to the condition.
 */
public class AssertFalseJUnit4Test {
    @Test
    public void assertFalse() {
        Assert.assertFalse(false);
    }

    /**
     * Note that in JUnit4, the failure message parameter comes prior to the condition.
     */
    @Test
    public void assertFalseWithMessage(){
        Assert.assertFalse("My message", false);
    }
}
