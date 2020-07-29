package com.hades.example.java.refactoring.after._c6._c6_9_substitute_algorithm;

import java.util.Arrays;
import java.util.List;

public class Example {

    String foundPerson(String[] people) {
        List<String> candidates = Arrays.asList("Don", "John", "Kent");

        // SESSION:foreach
        for (String person : people) {
            if (candidates.contains(person)) {
                return person;
            }
        }
        return "";
    }
}