package com.hades.example.java.refactoring.before._c8._c8_3_replace_data_value_with_object;

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