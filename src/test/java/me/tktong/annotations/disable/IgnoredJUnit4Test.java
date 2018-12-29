package me.tktong.annotations.disable;

import org.junit.Ignore;
import org.junit.Test;

/**
 * JUnit 4 uses the annotation {@link Ignore} at test class-level or test method-level.
 */
@Ignore
public class IgnoredJUnit4Test {
    @Test
    public void ignoredTest(){}
}
