package me.tktong.assertions.exceptions;

import org.junit.Assert;
import org.junit.Test;

public class ExpectedExceptionsJunit4Test {
    private static final String EXCEPTION_MESSAGE = "Message inside exception";

    @Test(expected = RuntimeException.class)
    public void assertExceptionThrown() {
        throw new RuntimeException();
    }

    @Test
    public void assertExceptionThrownWithExceptionMessage() {
        try {
            someBusinessLogic(EXCEPTION_MESSAGE);
            Assert.fail();
        } catch(final RuntimeException e) {
            Assert.assertEquals(EXCEPTION_MESSAGE, e.getMessage());
        }
    }

    private void someBusinessLogic(final String message) {
        throw new RuntimeException(message);
    }
}
