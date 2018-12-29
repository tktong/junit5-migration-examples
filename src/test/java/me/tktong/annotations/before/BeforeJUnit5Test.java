package me.tktong.annotations.before;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * JUnit5 uses the {@link org.junit.jupiter.api.BeforeEach} annotation to run code prior to each test method. The
 * before each method may be package-private.
 */
class BeforeJUnit5Test {
    @BeforeEach
    void before() {
        // Code to run prior to each test method
    }

    @Test
    void someTest(){}
}