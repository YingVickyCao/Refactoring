package com.hades.example.java.refactoring.after._c8._c8_12_replace_record_with_data_class;

public class DBHandler {

    public AnimalRecord parseAnimal(String[] record) {
        return new AnimalRecord(record[0], Integer.valueOf(record[1]), record[2]);
    }

    private String[] readFromAnimalDB() {
        return new String[]{"Tom", "1", "White"};
    }

    public AnimalRecord getAnimal() {
        String[] animalRecord = readFromAnimalDB();
        return parseAnimal(animalRecord);
    }
}