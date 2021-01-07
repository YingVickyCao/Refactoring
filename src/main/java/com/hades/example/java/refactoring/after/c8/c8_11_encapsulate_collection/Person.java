package com.hades.example.java.refactoring.after.c8.c8_11_encapsulate_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Person {
    private List<Course> _courses = new ArrayList<>();

    // 返回一个只读读本
    public List<Course> getCourses() {
        return Collections.unmodifiableList(_courses);
    }

    void initCourses(List<Course> courses) {
        if (null == courses) {
            return;
        }
        _courses.addAll(courses);
    }

    void add(Course arg) {
        _courses.add(arg);
    }

    void remove(Course course) {
        _courses.remove(course);
    }

    int size() {
        return _courses.size();
    }

    int numOfAdvancedCourses() {
        int count = 0;
        for (Course each : _courses) {
            if (null != each && each.isAdvance()) {
                count++;
            }
        }
        return count;
    }
}