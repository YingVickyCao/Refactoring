package com.hades.example.java.refactoring.before.c7._c7_4_inline_class;

public class TelephoneNumber {
    private String _officeAreaCode;
    private String _officeNumber;

    public String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    public void setOfficeAreaCode(String arg) {
        _officeAreaCode = arg;
    }

    public String getOfficeNumber() {
        return _officeNumber;
    }

    public void setOfficeNumber(String arg) {
        _officeNumber = arg;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ") " + _officeNumber);
    }
}