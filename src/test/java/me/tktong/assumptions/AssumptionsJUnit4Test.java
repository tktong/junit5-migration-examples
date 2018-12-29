package me.tktong.assumptions;

import org.hamcrest.CoreMatchers;
import org.junit.Assume;
import org.junit.Test;

/**
 * JUnit4 uses assumption methods from {@link org.junit.Assume}.
 */
public class AssumptionsJUnit4Test {
    @Test
    public void assumeFalse() {
        Assume.assumeFalse(false);
    }

    @Test
    public void assumeFalseWithMessage() {
        Assume.assumeFalse("My message", false);
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
        Assume.assumeNotNull(new Object());
    }

    @Test
    public void assumeTrue() {
        Assume.assumeTrue(true);
    }

    @Test
    public void assumeTrueWithMessage() {
        Assume.assumeTrue("My message", true);
    }

    @Test
    public void assumeThat() {
        Assume.assumeThat("Actual", CoreMatchers.notNullValue());
    }

    @Test
    public void assumeThatWithMessage(){
        Assume.assumeThat("My message", "Actual", CoreMatchers.notNullValue());
    }
}
