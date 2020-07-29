package com.hades.example.java.refactoring.after._c6._c6_2_inline_method;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExampleTest {
    @Test
    public void getRating() {
        Example example = new Example();
        assertEquals(1, example.getRating());
        example.setNumberOfFiveLateDeliveries(10);
        assertEquals(2, example.getRating());
    }
}