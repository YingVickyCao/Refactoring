package com.hades.example.java.refactoring.after._c8._c8_5_replace_array_with_object;

public class Example {
    public static void main(String[] args) {
        Performance row = new Performance();
        row.setName("Green tree");
        row.setWins(15);
        row.setFail(2);

        System.out.println(row.getName());
        System.out.println(row.getWins());
        System.out.println(row.getFail());
    }
}