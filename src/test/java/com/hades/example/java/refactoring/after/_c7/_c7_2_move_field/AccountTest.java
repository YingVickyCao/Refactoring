package com.hades.example.java.refactoring.after._c7._c7_2_move_field;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {
    @Test
    public void interestForAmount_days() {
        Account account = new Account();
        Assert.assertEquals(20547.945205479453, account.interestForAmount_days(10, 50), 20547);
    }
}