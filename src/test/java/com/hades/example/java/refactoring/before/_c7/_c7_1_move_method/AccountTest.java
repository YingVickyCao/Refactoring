package com.hades.example.java.refactoring.before._c7._c7_1_move_method;

import org.junit.Assert;
import org.junit.Test;

public class AccountTest {

    @Test
    public void bankCharge() {
        Account account = new Account(new AccountType(), 10);
        Assert.assertEquals(17.05D, account.bankCharge(), 17.05D);
    }
}