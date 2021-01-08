package com.hades.example.java.refactoring.before.c9.c9_7_introduce_null_object;

class Customer {
    PaymentHistory _paymentHistory;
    String _name;

    String getName() {
        return _name;
    }

    PaymentHistory getPaymentHistory() {
        return _paymentHistory;
    }
}
