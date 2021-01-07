package com.hades.example.java.refactoring.after.c6.c6_8_replace_method_with_method_object;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void gumma() {
        Account example = new Account();
        Assert.assertEquals(2380, example.gamma(10, 20, 30));
    }
}