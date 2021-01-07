package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public abstract class Course {
    static final int MATH = 0;
    static final int ENGLISH = 1;
    static final int MEDIA = 2;

    static Course create(int type) {
        switch (type) {
            case MATH:
                return new MathCourse();
            case ENGLISH:
                return new EnglishCourse();
            case MEDIA:
                return new MediaCourse();
            default:
                throw new IllegalArgumentException("Incorrect type code value");
        }
    }

    protected Course() {
    }

    public abstract int getType();

    public abstract int getHours();
}
