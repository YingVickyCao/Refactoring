package com.hades.example.java.refactoring.before.c7.c7_2_move_field;

public class Account {
    private AccountType _type = new AccountType();
    // TODO:
    //  Given： AccountType有很多地方使用了_interestRate。
    //  Then : 想把 _interestRate 移动到 AccountType，但是有其他函数在引用他它
    private double _interestRate = 15000;

    double interestForAmount_days(double amount, int days) {
        return _interestRate * amount * days / 365;
    }
}