package me.tktong.assumptions;

import org.hamcrest.CoreMatchers;
import org.junit.Assume;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

/**
 * JUnit4 uses assumption methods from {@link org.junit.Assume}.
 */
public class AssumptionsJUnit4Test {
    @Test
    public void assumeFalse() {
        Assume.assumeFalse(true);
    }

    @Test
    public void assumeFalseWithMessage() {
        Assume.assumeFalse("My message", true);
    }

    @Test
    public void assumeNoException() {
        try {
            throw new RuntimeException();
        } catch(final Exception e) {
            Assume.assumeNoException(e);
        }
    }

    @Test
    public void assumeNoExceptionWithMessage(){
        try {
            throw new RuntimeException();
        } catch(final Exception e) {
            Assume.assumeNoException("My message", e);
        }
    }

    @Test
    public void assumeNotNull() {
        Assume.assumeNotNull(null,null);
    }

    @Test
    public void assumeTrue() {
        Assume.assumeTrue(false);
    }

    @Test
    public void assumeTrueWithMessage() {
        Assume.assumeTrue("My message", false);
    }

    @Test
    public void assumeThat() {
        Assume.assumeThat("Actual", CoreMatchers.endsWith("someSuffix"));
    }

    @Test
    public void assumeThatWithMessage(){
        Assume.assumeThat("My message", "Actual", CoreMatchers.endsWith("someSuffix"));
    }
}
