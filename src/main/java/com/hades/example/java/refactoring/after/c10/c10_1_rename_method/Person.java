package com.hades.example.java.refactoring.after.c10.c10_1_rename_method;

class Person {
    String _officeAreaCode = "86";
    String _officeNumber = "12345678";

    String getOfficeTelephoneNumber() {
        return ("(" + _officeAreaCode + ") " + _officeNumber);
    }
}