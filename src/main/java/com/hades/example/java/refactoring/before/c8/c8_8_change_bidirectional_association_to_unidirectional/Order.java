package com.hades.example.java.refactoring.before.c8.c8_8_change_bidirectional_association_to_unidirectional;

public class Order {
    Customer _custom;

    public Customer getCustom() {
        return _custom;
    }

    void setCustomer(Customer arg) {
        if (_custom != null) {
            _custom.friendOrder().remove(this);
        }
        _custom = arg;
        if (_custom != null) {
            _custom.friendOrder().add(this);
        }
    }

    double getDiscountedPrice() {
        return getCrossPrice() * (1 - _custom.getDiscount());
    }

    double getCrossPrice() {
        return 255;
    }
}