package com.hades.example.java.refactoring.before.c9.c9_8_introduce_assertion;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee();
//        employee.setExpenseLimit(100);
        employee.setExpenseLimit(Employee.NULL_EXPENSE);    // NullPointerException
        System.out.println(employee.getExpenseLimit());
    }
}
