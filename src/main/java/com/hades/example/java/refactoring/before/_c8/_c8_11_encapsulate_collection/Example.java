package com.hades.example.java.refactoring.before._c8._c8_11_encapsulate_collection;

import java.util.List;

class Example {
    public static void main(String[] args) {
        Person person = new Person();
        List<Course> courses = person.getCourses();

        Course math = new Course("数学", false);
        Course english = new Course("英文", true);

        courses.add(math);
        courses.add(english);
        System.out.println(courses.size());

        courses.remove(english);
        System.out.println(courses.size());

        int count = 0;
        for (Course each : courses) {
            if (null != each && each.isAdvance()) {
                count++;
            }
        }
        System.out.println("高级课程:" + count);
    }
}
