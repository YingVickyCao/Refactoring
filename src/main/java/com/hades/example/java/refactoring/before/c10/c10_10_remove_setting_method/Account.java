package com.hades.example.java.refactoring.before.c10.c10_10_remove_setting_method;

public class Account {
    private String _id;

    public Account(String id) {
        _id = id;
    }

    public void setId(String id) {
        _id = id;
    }
}
