package dev.topani.sample;

import org.junit.Assert;
import org.junit.Test;

public class SampleAppTest {
    @Test public void test() {
        SampleApp sat = new SampleApp();
        String expected = sat.testMethod();
        String actual = "What's Up?";
        Assert.assertEquals(expected, actual);
    }
}
