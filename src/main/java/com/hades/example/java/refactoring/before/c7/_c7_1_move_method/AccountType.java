package com.hades.example.java.refactoring.before.c7._c7_1_move_method;

public class AccountType {
    boolean _isPremium;

    public AccountType() {
        _isPremium = false;
    }

    boolean isPremium() {
        return _isPremium;
    }
}