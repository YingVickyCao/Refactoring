package com.hades.example.java.refactoring.after.c7.c7_2_move_field;

public class Account2 {
    private AccountType _type = new AccountType();

//    private double _interestRate = 15000;

    // Step 1 : When _interestRate invoked by many method, First Self Encapsulate Field(171)
//    double interestForAmount_days(double amount, int days) {
//        return getInterestRate() * amount * days / 365;
//    }
//
//    public double getInterestRate() {
//        return _interestRate;
//    }
//
//    public void setInterestRate(double interestRate) {
//        _interestRate = interestRate;
//    }

    // Step 2 :
    double interestForAmount_days(double amount, int days) {
        return getInterestRate() * amount * days / 365;
    }

    /**
     *
     * Recommend : AccountType.getInterestRate()
     */
    @Deprecated
    public double getInterestRate() {
        return +_type.getInterestRate();
    }

    /**
     *
     * Recommend : AccountType.setInterestRate(doble)
     */
    @Deprecated
    public void setInterestRate(double interestRate) {
        _type.setInterestRate(interestRate);
    }
    // Step 3 :当用户 get 和 set 全部切换到 AccountType，删除 Deprecated
}