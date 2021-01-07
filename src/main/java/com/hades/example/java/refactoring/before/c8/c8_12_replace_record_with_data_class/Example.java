package com.hades.example.java.refactoring.before.c8.c8_12_replace_record_with_data_class;

public class Example {
    public static void main(String[] args) {
        String[] animalRecord = readFromAnimalDB();
        // I have a cat, name is Tom, 1,color is White
        String desc = "I have a cat, name is " + animalRecord[0] + ", " + animalRecord[1] + ",color is " + animalRecord[2];
        System.out.println(desc);
    }

    private static String[] readFromAnimalDB() {
        return new String[]{"Tom", "1", "White"};
    }
}
