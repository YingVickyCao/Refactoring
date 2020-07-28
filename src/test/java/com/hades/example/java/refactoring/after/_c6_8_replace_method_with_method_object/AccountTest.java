package com.hades.example.java.refactoring.after._c6_8_replace_method_with_method_object;

import com.hades.example.java.refactoring.before._c6_8_replace_method_with_method_object.Account;
import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void gumma() {
        Account example = new Account();
        Assert.assertEquals(2380, example.gamma(10, 20, 30));
    }
}