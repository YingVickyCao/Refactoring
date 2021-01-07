package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class MathCourse extends Course {
    protected MathCourse() {
        super();
    }

    @Override
    public int getType() {
        return Course.MATH;
    }

    @Override
    public int getHours() {
        return 15;
    }
}
