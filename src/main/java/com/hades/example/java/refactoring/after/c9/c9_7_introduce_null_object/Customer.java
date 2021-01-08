package com.hades.example.java.refactoring.after.c9.c9_7_introduce_null_object;

class Customer implements Nullable {
    PaymentHistory _paymentHistory;
    String _name;

    String getName() {
        return _name;
    }

    PaymentHistory getPaymentHistory() {
        return _paymentHistory;
    }

    public boolean isNull() {
        return false;
    }

    static Customer createNull() {
        return new NullCustomer();
    }
}