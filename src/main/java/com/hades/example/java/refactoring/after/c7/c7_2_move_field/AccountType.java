package com.hades.example.java.refactoring.after.c7.c7_2_move_field;

public class AccountType {
    private double _interestRate = 15000;

    public double getInterestRate() {
        return _interestRate;
    }

    public void setInterestRate(double _interestRate) {
        this._interestRate = _interestRate;
    }
}