package com.hades.example.java.refactoring.after.c9.c9_7_introduce_null_object;

public class NullCustomer extends Customer {
    public boolean isNull(){
        return true;
    }

    @Override
    String getName() {
        return "invalid name";
    }

    @Override
    PaymentHistory getPaymentHistory() {
        return PaymentHistory.newNull();
    }
}