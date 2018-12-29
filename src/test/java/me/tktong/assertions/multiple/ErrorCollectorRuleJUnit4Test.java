package me.tktong.assertions.multiple;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class ErrorCollectorRuleJUnit4Test {
    @Rule
    public final ErrorCollector errorCollector = new ErrorCollector();

    @Test
    public void someTest() {
        try {
            Assert.assertFalse(true);
        } catch(final Throwable t) {
            errorCollector.addError(t);
        }

        try {
            Assert.assertEquals(1L, 3L);
        } catch(final Throwable t) {
            errorCollector.addError(t);
        }

        try {
            Assert.assertEquals("Some expected text", "Some other text");
        } catch(final Throwable t) {
            errorCollector.addError(t);
        }
    }
}
