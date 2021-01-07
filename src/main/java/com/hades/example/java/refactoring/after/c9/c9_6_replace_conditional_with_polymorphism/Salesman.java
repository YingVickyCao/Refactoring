package com.hades.example.java.refactoring.after.c9.c9_6_replace_conditional_with_polymorphism;

class Salesman extends EmployeeType {
    @Override
    int getTypeCode() {
        return EmployeeType.SALESMAN;
    }

    int getPayAmount(Employee employee) {
        return employee.getMonthSalary() + employee.getBonus();
    }
}
