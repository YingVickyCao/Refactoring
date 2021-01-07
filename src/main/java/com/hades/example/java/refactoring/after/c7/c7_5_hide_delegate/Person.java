package com.hades.example.java.refactoring.after.c7.c7_5_hide_delegate;

public class Person {
    Department _department;

//    public Department getDepartment() {
//        return _department;
//    }

    public void setDepartment(Department department) {
        _department = department;
    }

    public Person getManager() {
        return _department.getManager();
    }
}