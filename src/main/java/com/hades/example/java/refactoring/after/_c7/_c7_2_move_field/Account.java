package com.hades.example.java.refactoring.after._c7._c7_2_move_field;

public class Account {
    private AccountType _type = new AccountType();
    
    double interestForAmount_days(double amount, int days) {
        return _type.getInterestRate() * amount * days / 365;
    }
}