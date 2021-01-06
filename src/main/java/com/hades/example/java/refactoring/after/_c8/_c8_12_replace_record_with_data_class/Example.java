package com.hades.example.java.refactoring.after._c8._c8_12_replace_record_with_data_class;

public class Example {
    public static void main(String[] args) {
        DBHandler dbParse = new DBHandler();
        AnimalRecord animal = dbParse.getAnimal();
        // I have a cat, name is Tom, 1,color is White
        String desc = "I have a cat, name is " + animal.getName() + ", " + animal.getAge() + ",color is " + animal.getColor();
        System.out.println(desc);
    }
}