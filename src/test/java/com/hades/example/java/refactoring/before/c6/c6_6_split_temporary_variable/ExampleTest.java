package com.hades.example.java.refactoring.before.c6.c6_6_split_temporary_variable;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {
    @Test
    public void getDistanceTravelled() {
        Example example = new Example();
        Assert.assertEquals(12.5, example.getDistanceTravelled(5), 12.5);
    }
}