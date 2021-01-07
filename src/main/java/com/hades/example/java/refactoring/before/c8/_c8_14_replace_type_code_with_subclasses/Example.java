package com.hades.example.java.refactoring.before.c8._c8_14_replace_type_code_with_subclasses;

public class Example {
    public static void main(String[] args) {
        Course course = new Course(Course.ENGLISH);
        System.out.println(course.getType());
        System.out.println(course.getHours());

        Course course2 = new Course(Course.MEDIA);
        System.out.println(course2.getType());
        System.out.println(course2.getHours());

        Course course3 = new Course(Course.MATH);
        System.out.println(course3.getType());
        System.out.println(course3.getHours());
    }
}
