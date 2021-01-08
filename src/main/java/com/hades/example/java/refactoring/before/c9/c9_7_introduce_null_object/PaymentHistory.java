package com.hades.example.java.refactoring.before.c9.c9_7_introduce_null_object;

public class PaymentHistory {
    int getWeeksDelinquentInLastYear() {
        return 1000;
    }

    static PaymentHistory basic() {
        return new PaymentHistory();
    }
}
