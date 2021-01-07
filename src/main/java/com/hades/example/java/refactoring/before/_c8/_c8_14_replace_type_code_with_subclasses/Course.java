package com.hades.example.java.refactoring.before._c8._c8_14_replace_type_code_with_subclasses;

public class Course {
    private int _type;
    static final int MATH = 0;
    static final int ENGLISH = 1;
    static final int MEDIA = 2;

    public Course(int type) {
        _type = type;
    }

    public int getType() {
        return _type;
    }

    int getHours() {
        switch (_type) {
            case MATH:
                return 15;
            case MEDIA:
                return 17;
            case ENGLISH:
                return 16;
            default:
                return 10;
        }
    }
}