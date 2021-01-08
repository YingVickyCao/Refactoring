package com.hades.example.java.refactoring.before.c9.c9_7_introduce_null_object;

class Example {
    public static void main(String[] args) {
        Site site = new Site();
        Customer custom = site.getCustomer();

        PaymentHistory paymentHistory;
        if (null == custom) {
            paymentHistory = PaymentHistory.basic();
        } else {
            paymentHistory = custom.getPaymentHistory();
        }

        // ...
        String name;
        if (null == custom) {
            name = "invalid name";
        } else {
            name = custom.getName();
        }
    }
}
