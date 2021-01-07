package com.hades.example.java.refactoring.after._c8._c8_15_replace_type_code_with_state_or_strategy;

public class Example {
    public static void main(String[] args) {
        Employee employee = new Employee(EmployeeType.SALESMAN);
        System.out.println(employee.getType());
        System.out.println(employee.getPayAmount());

        employee.setType(EmployeeType.ENGINEER);
        System.out.println(employee.getType());
        System.out.println(employee.getPayAmount());
    }
}