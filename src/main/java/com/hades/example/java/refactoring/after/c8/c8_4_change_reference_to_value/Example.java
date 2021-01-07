package com.hades.example.java.refactoring.after.c8.c8_4_change_reference_to_value;

public class Example {
    public static void main(String[] args) {
        Currency currency = new Currency("CNY");
        System.out.println(currency.equals(new Currency("CNY")));;
    }
}