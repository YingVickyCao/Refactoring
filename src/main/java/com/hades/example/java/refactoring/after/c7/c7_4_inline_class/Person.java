package com.hades.example.java.refactoring.after.c7.c7_4_inline_class;

public class Person {
    private String _name;
    private String _officeAreaCode;  // TODO: +86
    private String _officeNumber;   // TODO:

    public String getName() {
        return _name;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ") " + _officeNumber);
    }

    String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    void setOfficeAreaCode(String arg) {
        _officeAreaCode = arg;
    }

    String getOfficeNumber() {
        return _officeNumber;
    }

    void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }
}
