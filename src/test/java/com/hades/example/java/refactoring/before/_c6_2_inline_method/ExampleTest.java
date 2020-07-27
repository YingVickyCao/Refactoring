package com.hades.example.java.refactoring.before._c6_2_inline_method;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleTest {
    @Test
    public void getRating() {
        Example example = new Example();
        Assert.assertEquals(1, example.getRating());
        example.setNumberOfFiveLateDeliveries(10);
        Assert.assertEquals(2, example.getRating());
    }
}