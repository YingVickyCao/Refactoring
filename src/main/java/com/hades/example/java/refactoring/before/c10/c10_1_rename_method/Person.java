package com.hades.example.java.refactoring.before.c10.c10_1_rename_method;

class Person {
    String _officeAreaCode = "86";
    String _officeNumber = "12345678";
    String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ") " + _officeNumber);
    }
}