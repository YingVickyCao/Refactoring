package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class Example {
    public static void main(String[] args) {
        Course course = Course.create(Course.ENGLISH);
        System.out.println(course.getType());
        System.out.println(course.getHours());

        Course course2 = Course.create(Course.MEDIA);
        System.out.println(course2.getType());
        System.out.println(course2.getHours());

        Course course3 = Course.create(Course.MATH);
        System.out.println(course3.getType());
        System.out.println(course3.getHours());
    }
}
