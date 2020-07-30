package com.hades.example.java.refactoring.after._c7._c7_5_hide_delegate;

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