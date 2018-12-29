package me.tktong.annotations.tag;

import org.junit.Test;
import org.junit.experimental.categories.Category;

/**
 * JUnit4 creates interfaces that tests can categorize themselves as. Then suites can include certain types of
 * categories to run.
 */
@Category(SomeCategoryTest.class)
public class CategoryJUnit4Test {
    @Test
    public void someTest(){}
}