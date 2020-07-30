package com.hades.example.java.refactoring.before._c7._c7_4_inline_class;

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