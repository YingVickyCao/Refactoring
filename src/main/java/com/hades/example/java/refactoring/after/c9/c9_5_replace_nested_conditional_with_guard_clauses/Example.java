package com.hades.example.java.refactoring.after.c9.c9_5_replace_nested_conditional_with_guard_clauses;

public class Example {
    public static void main(String[] args) {
        PaymentSystem paymentSystem = new PaymentSystem();
        System.out.println(paymentSystem.getPayAmount());

        Capital capital = new Capital();
        System.out.println(capital.getAdjustedCapital());
    }
}