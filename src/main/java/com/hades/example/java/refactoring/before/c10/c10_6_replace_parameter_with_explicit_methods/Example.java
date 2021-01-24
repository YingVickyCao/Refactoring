package com.hades.example.java.refactoring.before.c10.c10_6_replace_parameter_with_explicit_methods;

public class Example {
    public static void main(String[] args) {
        Employee employee = Employee.create(Employee.ENGINEER);
        System.out.println(employee.getClass().getSimpleName());// Engineer

        MyView myView = new MyView();
        myView.setValue("width", 20);

        Switch switchView = new Switch();
        switchView.setState(true);
    }
}