package com.hades.example.java.refactoring.before._c9._c9_6_replace_conditional_with_polymorphism;

class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}