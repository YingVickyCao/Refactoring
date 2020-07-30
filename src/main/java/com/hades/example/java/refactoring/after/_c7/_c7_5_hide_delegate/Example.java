package com.hades.example.java.refactoring.after._c7._c7_5_hide_delegate;

public class Example {
    public void test(){
        Person person = new Person();
        Department department  = new Department(person);
    }
}
