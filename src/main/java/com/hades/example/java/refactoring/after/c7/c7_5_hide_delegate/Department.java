package com.hades.example.java.refactoring.after.c7.c7_5_hide_delegate;

public class Department {
    private String _chargeCode;
    private Person _manager;

    public Department(Person manager) {
        _manager = manager;
    }

    public Person getManager() {
        return _manager;
    }
}