package com.hades.example.java.refactoring.after.c8.c8_1_self_encapsulate_field;

public class Test {
    public static void main(String[] args) {
        IntRange intRange = new IntRange(1, 20);
        System.out.println(intRange.getHigh());

        CappedRange range = new CappedRange(1, 20, 15);
        System.out.println(range.getHigh());
    }
}