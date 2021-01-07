package com.hades.example.java.refactoring.before.c8._c8_13_replace_type_code_with_class;

public class Example {
    public static void main(String[] args) {
        Person person = new Person(Person.O);
        System.out.println(person.getBloodGroup()); // 0

        person.setBloodGroup(Person.AB);
        System.out.println(person.getBloodGroup()); // 3
    }
}
