package com.hades.example.java.refactoring.before.c9.c9_6_replace_conditional_with_polymorphism;

class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}