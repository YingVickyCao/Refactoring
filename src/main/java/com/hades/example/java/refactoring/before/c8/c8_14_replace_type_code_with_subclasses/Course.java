package com.hades.example.java.refactoring.before.c8.c8_14_replace_type_code_with_subclasses;

public class Course {
    static final int MATH = 0;
    static final int ENGLISH = 1;
    static final int MEDIA = 2;

    // 宿主类有一个不可变的类型码，它会影响该类的行为
    private final int _type;
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