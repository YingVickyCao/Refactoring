package com.hades.example.java.refactoring.after.c10.c10_5_parameterize_method;

import org.junit.Assert;
import org.junit.Test;

public class ChangeTest {

    @Test
    public void test(){
        Change change = new Change();
        Assert.assertEquals(1.5, change.baseCharge(), 1.5);
    }
}