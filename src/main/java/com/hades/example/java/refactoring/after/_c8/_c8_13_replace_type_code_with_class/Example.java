package com.hades.example.java.refactoring.after._c8._c8_13_replace_type_code_with_class;

public class Example {
    public static void main(String[] args) {
//        Person person = new Person(Person.O);
        Person person = new Person(BloodGroup.O);
        System.out.println(person.getBloodGroupCode()); // 0

//        person.setBloodGroup(Person.AB);
        person.setBloodGroup(BloodGroup.AB);
        System.out.println(person.getBloodGroupCode()); // 3
    }
}