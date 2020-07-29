package com.hades.example.java.refactoring.after._c7._c7_1_move_method;

public class Account {
    //  有几种账户，每一种账户都一个自己都透支金额计费规则
    private AccountType _type;
    private int _daysOverdrawn;

    public Account(AccountType _type, int _daysOverdrawn) {
        this._type = _type;
        this._daysOverdrawn = _daysOverdrawn;
    }

    // Session : Step 1 : overdraftCharge
//    double bankCharge() {
//        double result = 4.5;
//        if (_daysOverdrawn > 0) result += overdraftCharge();
//        return result;
//    }

//    double overdraftCharge() {
//        return _type.overdraftCharge(_daysOverdrawn);
//    }

    double bankCharge() {
        double result = 4.5;
        // Session : Step 2
        if (_daysOverdrawn > 0) result += _type.overdraftCharge(_daysOverdrawn);
        return result;
    }
}