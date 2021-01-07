package com.hades.example.java.refactoring.after.c6.c6_3_inline_temp;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void isBigPrice() {
        Example example = new Example();
        Assert.assertFalse(example.isBigPrice());
    }
}