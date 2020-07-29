package com.hades.example.java.refactoring.before._c6._c6_9_substitute_algorithm;

import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void foundPerson() {
        Example example = new Example();
        String[] strings = new String[]{"Don", "ABC"};
        Assert.assertEquals("Don", example.foundPerson(strings));
    }
}