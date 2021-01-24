package com.hades.example.java.refactoring.after.c10.c10_6_replace_parameter_with_explicit_methods;

public class Example {
    public static void main(String[] args) {
        Employee employee = Employee.createEngineer();
        System.out.println(employee.getClass().getSimpleName());    // Engineer

        MyView myView = new MyView();
        myView.setWidth(20);

        Switch switchView = new Switch();
        switchView.beOn();
    }
}