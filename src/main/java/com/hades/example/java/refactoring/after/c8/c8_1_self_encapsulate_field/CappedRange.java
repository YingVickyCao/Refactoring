package com.hades.example.java.refactoring.after.c8.c8_1_self_encapsulate_field;

public class CappedRange extends IntRange {
    private int cap;

    public CappedRange(int low, int high, int cap) {
        super(low, high);
        this.cap = cap;
    }

    public int getCap() {
        return cap;
    }

    @Override
    public int getHigh() {
        return Math.min(super.getHigh(), getCap());
    }
}