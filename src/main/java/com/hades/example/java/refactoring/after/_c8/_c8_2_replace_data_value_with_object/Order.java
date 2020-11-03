package com.hades.example.java.refactoring.after._c8._c8_2_replace_data_value_with_object;

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