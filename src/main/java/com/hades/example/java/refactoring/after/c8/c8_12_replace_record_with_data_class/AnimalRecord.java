package com.hades.example.java.refactoring.after.c8.c8_12_replace_record_with_data_class;

public class AnimalRecord {
    private String name;
    private int age;
    private String color;

    public AnimalRecord(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }
}