package me.tktong.annotations.lifecycle;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LifecycleJUnit5Test {
    /**
     * JUnit5 uses the {@link org.junit.jupiter.api.BeforeAll} annotation to run code before all test methods. The
     * before all method must be static and may be package-private.
     */
    @BeforeAll
     static void beforeAll() {
        System.out.println("Before all ran");
    }

    /**
     * JUnit5 uses the {@link org.junit.jupiter.api.BeforeEach} annotation to run code before each test method. The
     * before method may be package-private.
     */
    @BeforeEach
     void before() {
        System.out.println("Before ran");
    }

    /**
     * JUnit5 uses the {@link org.junit.jupiter.api.AfterEach} annotation to run code after each test method. The after
     * method may be package-private.
     */
    @AfterEach
     void after() {
        System.out.println("After ran");
    }

    /**
     * JUnit5 uses the {@link org.junit.jupiter.api.AfterAll} annotation to run code after all test methods. The
     * after all method must be static and may be package-private.
     */
    @AfterAll
     static void afterAll() {
        System.out.println("After all ran");
    }

    @Test
     void someTest1() {}

    @Test
     void someTest2() {}
}