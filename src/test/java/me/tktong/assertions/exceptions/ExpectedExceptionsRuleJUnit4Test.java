package me.tktong.assertions.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExpectedExceptionsRuleJUnit4Test {
    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void assertExceptionThrown() {
        final String message = "My message";

        expectedException.expect(RuntimeException.class);
        expectedException.expectMessage(message);

        throw new RuntimeException(message);
    }
}
