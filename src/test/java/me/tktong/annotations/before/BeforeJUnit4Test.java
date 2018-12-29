package me.tktong.annotations.before;

import org.junit.Before;
import org.junit.Test;

/**
 * JUnit4 uses the {@link org.junit.Before} annotation to run code prior to each test method. The before method must
 * be public
 */
public class BeforeJUnit4Test {
    @Before
    public void before() {
        // Code to run before each test-method
    }

    @Test
    public void someTest (){}
}
