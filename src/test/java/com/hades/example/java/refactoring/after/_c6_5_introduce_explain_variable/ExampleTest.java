package com.hades.example.java.refactoring.after._c6_5_introduce_explain_variable;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void price() {
        Example example = new Example();
        Assert.assertEquals(202.0, example.price(), 202);
    }
}