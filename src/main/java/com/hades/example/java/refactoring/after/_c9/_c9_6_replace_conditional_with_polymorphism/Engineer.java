package com.hades.example.java.refactoring.after._c9._c9_6_replace_conditional_with_polymorphism;

class Engineer extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.ENGINEER;
    }

    int getPayAmount(Employee employee) {
        return employee.getMonthSalary();
    }
}