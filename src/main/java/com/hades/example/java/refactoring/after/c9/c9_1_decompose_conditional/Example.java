package com.hades.example.java.refactoring.after.c9.c9_1_decompose_conditional;

import java.time.LocalDate;

public class Example {
    LocalDate SUMMER_START = LocalDate.of(2021, 6, 1);
    LocalDate SUMMER_END = LocalDate.of(2021, 9, 30);

    private int charge;
    private int quantity = 1000;
    private int _winterRate = 10;
    private int _summerRate = 9;
    private int _winterServiceCharge = 2;

    private void totalPrice(LocalDate date) {
        if (isNotSummer(date)) {
            charge = getWinterChange();
        } else {
            charge = getSummerChange();
        }
    }

    public int getCharge() {
        return charge;
    }

    private boolean isNotSummer(LocalDate date) {
        return date.isBefore(SUMMER_START) || date.isAfter(SUMMER_END);
    }

    private int getWinterChange() {
        return quantity * _winterRate + _winterServiceCharge;
    }

    private int getSummerChange() {
        return quantity * _summerRate;
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.totalPrice(LocalDate.now());
        System.out.println(example.getCharge());
    }
}
