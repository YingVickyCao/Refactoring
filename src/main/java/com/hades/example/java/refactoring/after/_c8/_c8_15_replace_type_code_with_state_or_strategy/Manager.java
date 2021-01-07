package com.hades.example.java.refactoring.after._c8._c8_15_replace_type_code_with_state_or_strategy;

class Manager extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.MANAGER;
    }
}