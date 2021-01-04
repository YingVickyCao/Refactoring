package com.hades.example.java.refactoring.after._c8._c8_11_encapsulate_collection;

class Course {
    private String name;
    private boolean isAdvance;

    Course(String name, boolean isAdvance) {
        this.name = name;
        this.isAdvance = isAdvance;
    }

    boolean isAdvance() {
        return isAdvance;
    }

    public void setAdvance(boolean advance) {
        isAdvance = advance;
    }
}