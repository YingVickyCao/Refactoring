package com.hades.example.java.refactoring.after.c9.c9_7_introduce_null_object;

public class NullPaymentHistory extends PaymentHistory{
    int getWeeksDelinquentInLastYear() {
        return 0;
    }
}
