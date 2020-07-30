package com.hades.example.java.refactoring.after._c7._c7_3_extact_class;

public class Person {
    private String _name;
    TelephoneNumber _telephoneNumber = new TelephoneNumber();

    public String getName() {
        return _name;
    }

    String getTelephoneNumber() {
        return _telephoneNumber.getTelephoneNumber();
    }

    TelephoneNumber getTelephone() {
        return _telephoneNumber;
    }
}