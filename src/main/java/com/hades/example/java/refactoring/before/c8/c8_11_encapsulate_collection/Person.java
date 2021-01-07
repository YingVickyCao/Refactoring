package com.hades.example.java.refactoring.before.c8.c8_11_encapsulate_collection;

import java.util.ArrayList;
import java.util.List;

class Person {
    private List<Course> _courses = new ArrayList<>();

    List<Course> getCourses() {
        return _courses;
    }

    void setCourses(List<Course> courses) {
        _courses = courses;
    }
}