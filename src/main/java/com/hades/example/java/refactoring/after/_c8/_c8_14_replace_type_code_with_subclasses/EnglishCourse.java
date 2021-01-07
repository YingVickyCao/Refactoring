package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class EnglishCourse extends Course {
    protected EnglishCourse() {
        super();
    }

    @Override
    public int getType() {
        return Course.ENGLISH;
    }

    @Override
    public int getHours() {
        return 16;
    }
}
