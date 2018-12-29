package me.tktong.info;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;

public class TestNameRuleJUnit4Test {
    @Rule
    public final TestName testName = new TestName();

    @Test
    public void someTest() {
        Assert.assertEquals("someTest", testName.getMethodName());
    }
}
