package me.tktong.assertions.logical;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit4 uses assertion methods from {@link org.junit.Assert}
 */
public class AssertFalseJUnit4Test {
    @Test
    public void assertFalse() {
        Assert.assertFalse(false);
    }

    @Test
    public void assertFalseWithMessage(){
        Assert.assertFalse("My message", false);
    }
}
