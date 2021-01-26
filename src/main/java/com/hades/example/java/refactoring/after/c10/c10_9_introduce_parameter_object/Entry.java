package com.hades.example.java.refactoring.after.c10.c10_9_introduce_parameter_object;

public class Entry {
    private Date _chargeDate;
    private double _value;

    public Entry(Date chargeDate, double value) {
        _chargeDate = chargeDate;
        _value = value;
    }

    public Date getDate() {
        return _chargeDate;
    }

    public double getValue() {
        return _value;
    }
}