package com.hades.example.java.refactoring.before.c6.c6_2_inline_method;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void getRating() {
        Example example = new Example();
        Assert.assertEquals(1, example.getRating());
        example.setNumberOfFiveLateDeliveries(10);
        Assert.assertEquals(2, example.getRating());
    }
}