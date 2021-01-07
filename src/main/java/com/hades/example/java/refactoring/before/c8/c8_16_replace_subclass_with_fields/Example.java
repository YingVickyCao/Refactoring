package com.hades.example.java.refactoring.before.c8.c8_16_replace_subclass_with_fields;

public class Example {
    public static void main(String[] args) {
        Person p = new Male();
        System.out.println(p.isMale());
        System.out.println(p.getCode());

        Person p2 = new Female();
        System.out.println(p2.isMale());
        System.out.println(p2.getCode());
    }
}
