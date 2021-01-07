package com.hades.example.java.refactoring.after._c8._c8_16_replace_subclass_with_fields;

public class Example {
    public static void main(String[] args) {
        Person p = Person.createMale();
        System.out.println(p.isMale());
        System.out.println(p.getCode());

        Person p2 = Person.createFemale();
        System.out.println(p2.isMale());
        System.out.println(p2.getCode());
    }
}