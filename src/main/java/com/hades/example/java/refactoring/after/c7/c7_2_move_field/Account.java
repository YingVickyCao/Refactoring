package com.hades.example.java.refactoring.after.c7.c7_2_move_field;

public class Account {
    private AccountType _type = new AccountType();
    
    double interestForAmount_days(double amount, int days) {
        return _type.getInterestRate() * amount * days / 365;
    }
}