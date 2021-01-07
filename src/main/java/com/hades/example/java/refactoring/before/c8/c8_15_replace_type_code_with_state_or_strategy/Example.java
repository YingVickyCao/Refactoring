package com.hades.example.java.refactoring.before.c8.c8_15_replace_type_code_with_state_or_strategy;

class Example {
    public static void main(String[] args) {
        Employee employee = new Employee(Employee.SALESMAN);
        System.out.println(employee.getType());
        System.out.println(employee.getPayAmount());

        employee.setType(Employee.ENGINEER);
        System.out.println(employee.getType());
        System.out.println(employee.getPayAmount());
    }
}
