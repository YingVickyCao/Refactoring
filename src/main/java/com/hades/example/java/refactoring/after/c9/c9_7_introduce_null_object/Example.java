package com.hades.example.java.refactoring.after.c9.c9_7_introduce_null_object;

class Example {
    public static void main(String[] args) {
        Site site = new Site();
        Customer custom = site.getCustomer();

//        PaymentHistory paymentHistory;
//        if (custom.isNull()) {
//            paymentHistory = PaymentHistory.basic();
//        } else {
//            paymentHistory = custom.getPaymentHistory();
//        }
        PaymentHistory paymentHistory = custom.getPaymentHistory();

        // ...
//        String name;
//        if (custom.isNull()) {
//            name = "invalid name";
//        } else {
//            name = custom.getName();
//        }
        String name = custom.getName();
    }
}
