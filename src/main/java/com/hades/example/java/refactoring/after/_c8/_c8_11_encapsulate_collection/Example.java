package com.hades.example.java.refactoring.after._c8._c8_11_encapsulate_collection;

import java.util.List;

class Example {
    public static void main(String[] args) {
        Person person = new Person();
        Course math = new Course("数学", false);
        Course english = new Course("英文", true);

        person.add(math);
        person.add(english);
        System.out.println(person.size());

        person.remove(english);
        System.out.println(person.size());

        System.out.println("高级课程:" + person.numOfAdvancedCourses());

        List<Course> courseList = person.getCourses();
//        courseList.add(english); // ERROR: UnsupportedOperationException
        Course course = courseList.get(0);
        course.setAdvance(!course.isAdvance());
        System.out.println("高级课程:" + person.numOfAdvancedCourses());
    }
}
