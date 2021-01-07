package com.hades.example.java.refactoring.after.c7.c7_5_hide_delegate;

public class Example {
    public void test(){
        Person person = new Person();
        Department department  = new Department(person);
    }
}
