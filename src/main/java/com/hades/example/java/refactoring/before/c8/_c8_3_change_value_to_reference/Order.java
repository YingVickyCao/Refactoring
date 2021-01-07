package com.hades.example.java.refactoring.before.c8._c8_3_change_value_to_reference;

public class Order {
    private Custom _custom;

    public Order(String customerName) {
        this._custom = new Custom(customerName);
    }

    public String getCustomer() {
        return _custom.getName();
    }

    public void setCustomer(String customerName) {
        this._custom = new Custom(customerName);
    }
}