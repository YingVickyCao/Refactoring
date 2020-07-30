package com.hades.example.java.refactoring.before._c7._c7_5_hide_delegate;

public class Person {
    Department _department;

    public Department getDepartment() {
        return _department;
    }

    public void setDepartment(Department department) {
        _department = department;
    }
}