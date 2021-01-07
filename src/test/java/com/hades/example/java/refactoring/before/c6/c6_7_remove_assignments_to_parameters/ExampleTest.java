package com.hades.example.java.refactoring.before.c6.c6_7_remove_assignments_to_parameters;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void discount() {
        Example example = new Example();
        Assert.assertEquals(53, example.discount(60, 102, 10002));
        Assert.assertEquals(10, example.discount(10, 9, 900));
    }

    @Test
    public void calculate() {
        Example example = new Example();
        example.calculate();
    }

    @Test
    public void passedParamIsObject() {
        Example example = new Example();
        example.passedParamIsObject();
    }
}