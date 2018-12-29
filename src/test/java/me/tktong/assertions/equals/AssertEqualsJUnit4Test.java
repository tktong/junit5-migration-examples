package me.tktong.assertions.equals;

import org.junit.Assert;
import org.junit.Test;

/**
 * JUnit4 uses assertion methods from {@link org.junit.Assert}
 */
public class AssertEqualsJUnit4Test {
    private static final String MESSAGE = "My message";

    @Test
    public void assertDoubleEquals() {
        Assert.assertEquals(1.0, 1.0, 0.0);
    }

    @Test
    public void assertDoubleEqualsWithDelta() {
        Assert.assertEquals(1.0, 1.2, 0.5);
    }

    @Test
    public void assertDoubleEqualsWithDeltaAndMessage() {
        Assert.assertEquals(MESSAGE, 1.0, 1.2, 0.5);
    }

    @Test
    public void assertDoubleEqualsWithMessage(){
        Assert.assertEquals(MESSAGE, 1.0, 1.0, 0.0);
    }

    @Test
    public void assertFloatEquals() {
        Assert.assertEquals(1.0f, 1.0f, 0.0f);
    }

    @Test
    public void assertFloatEqualsWithDelta() {
        Assert.assertEquals( 1.0f, 1.2f, 0.5f);
    }

    @Test
    public void assertFloatEqualsWithDeltaAndMessage() {
        Assert.assertEquals(MESSAGE, 1.0f, 1.2f, 0.5f);
    }

    @Test
    public void assertFloatEqualsWithMessage() {
        Assert.assertEquals(MESSAGE, 1.0f, 1.0f, 0.0f);
    }

    @Test
    public void assertLongEquals() {
        Assert.assertEquals(1L, 1L);
    }

    @Test
    public void assertLongEqualsWithMessage() {
        Assert.assertEquals(MESSAGE, 1L, 1L);
    }

    @Test
    public void assertObjectEquals(){
        final Object object = new Object();
        Assert.assertEquals(object, object);
    }

    @Test
    public void assertObjectEqualsWithMessage(){
        final Object object = new Object();
        Assert.assertEquals(MESSAGE, object, object);
    }
}
