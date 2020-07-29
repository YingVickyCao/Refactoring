package com.hades.example.java.refactoring.after._c7_1_move_method;

public class AccountType {
    boolean _isPremium;

    public AccountType() {
        _isPremium = false;
    }

    public double overdraftCharge(int daysOverdrawn) {
        if (_isPremium) {
            double result = 10;
            if (daysOverdrawn > 7) {
                result += (daysOverdrawn - 7) * 0.85;
            }
            return result;
        } else return daysOverdrawn * 1.75;
    }
}