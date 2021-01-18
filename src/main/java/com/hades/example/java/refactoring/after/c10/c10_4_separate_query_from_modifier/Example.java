package com.hades.example.java.refactoring.after.c10.c10_4_separate_query_from_modifier;

public class Example {
    public static void main(String[] args) {
        String[] people = new String[]{"A", "Don", "B", "John", "Jerry", "Smith"};
        SystemControl systemControl = new SystemControl();
        systemControl.checkSecurity(people); // Don
    }
}