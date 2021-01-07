package com.hades.example.java.refactoring.before.c6._c6_4_replace_temp_with_query;


import org.junit.Assert;
import org.junit.Test;

public class ExampleTest {

    @Test
    public void getPrice() {
        Example example = new Example();
        Assert.assertEquals(19.6, example.getPrice(), 19.5);
    }
}