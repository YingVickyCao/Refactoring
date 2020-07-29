package com.hades.example.java.refactoring.before._c7._c7_1_move_method;

public class Account {
    //  有几种账户，每一种账户都一个自己都透支金额计费规则
    private AccountType _type;
    private int _daysOverdrawn;

    public Account(AccountType _type, int _daysOverdrawn) {
        this._type = _type;
        this._daysOverdrawn = _daysOverdrawn;
    }

    double bankCharge() {
        double result = 4.5;
        if (_daysOverdrawn > 0) result += overdraftCharge();
        return result;
    }

    // TODO: overdraftCharge
    double overdraftCharge() { //透支金计费，它和其他class的关系似乎比较密切。
        if (_type.isPremium()) {
            double result = 10;
            if (_daysOverdrawn > 7) result += (_daysOverdrawn - 7) * 0.85;
            return result;
        } else return _daysOverdrawn * 1.75;
    }
}