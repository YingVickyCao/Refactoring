package com.hades.example.java.refactoring.after._c7._c7_3_extact_class;

public final class ImmutableTelephoneNumber {
    private final String _officeAreaCode;
    private final String _officeNumber;

    public ImmutableTelephoneNumber(String officeAreaCode, String officeNumber) {
        _officeAreaCode = officeAreaCode;
        _officeNumber = officeNumber;
    }

    public String getOfficeAreaCode() {
        return _officeAreaCode;
    }

    public String getOfficeNumber() {
        return _officeNumber;
    }

    public String getTelephoneNumber() {
        return ("(" + _officeAreaCode + ") " + _officeNumber);
    }
}