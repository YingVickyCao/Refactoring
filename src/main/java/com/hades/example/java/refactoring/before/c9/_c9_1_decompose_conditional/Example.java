package com.hades.example.java.refactoring.before.c9._c9_1_decompose_conditional;

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
        if (date.isBefore(SUMMER_START) || date.isAfter(SUMMER_END)) {
            charge = quantity * _winterRate + _winterServiceCharge;
        } else {
            charge = quantity * _summerRate;
        }
    }

    public int getCharge() {
        return charge;
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.totalPrice(LocalDate.now());
        System.out.println(example.getCharge());
    }
}