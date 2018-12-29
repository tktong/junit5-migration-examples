package me.tktong.annotations.lifecycle;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class LifecycleJUnit4Test {
    /**
     * JUnit4 uses the {@link org.junit.BeforeClass} annotation to run code before all test methods. The before
     * all method must be public and static.
     */
    @BeforeClass
    public static void beforeAll() {
        System.out.println("Before all ran");
    }

    /**
     * JUnit4 uses the {@link org.junit.Before} annotation to run code before each test method. The before method
     * must be public.
     */
    @Before
    public void before() {
        System.out.println("Before ran");
    }

    /**
     * JUnit4 uses the {@link org.junit.After} annotation to run code after each test method. The after method must
     * be public.
     */
    @After
    public void after() {
        System.out.println("After ran");
    }

    /**
     * JUnit4 uses the {@link org.junit.AfterClass} annotation to run code after all test methods. The after all method
     * must be public and static.
     */
    @AfterClass
    public static void afterAll() {
        System.out.println("After all ran");
    }

    @Test
    public void someTest1() {}

    @Test
    public void someTest2() {}
}