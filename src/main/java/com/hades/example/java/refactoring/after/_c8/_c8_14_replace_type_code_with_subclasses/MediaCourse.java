package com.hades.example.java.refactoring.after._c8._c8_14_replace_type_code_with_subclasses;

public class MediaCourse extends Course {
    protected MediaCourse() {
        super();
    }

    @Override
    public int getType() {
        return Course.MEDIA;
    }

    @Override
    public int getHours() {
        return 17;
    }
}
