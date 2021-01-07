package com.hades.example.java.refactoring.before.c8._c8_8_change_bidirectional_association_to_unidirectional;

import java.util.ArrayList;
import java.util.List;

/**
 * "1对多"
 * 1 个订单 只属于1 个客户， 1 个客户有多个订单
 */
public class Customer {
    private List<Order> _orderList = new ArrayList<>();
    String name;

    public Customer(String name) {
        this.name = name;
    }

    List<Order> friendOrder() {
        return _orderList;
    }

    void addOrder(Order arg) {
        if (null != arg) {
            arg.setCustomer(this);
        }
    }

    double getDiscount() {
        return 0.1;
    }

    double getPriceFor(Order order) {
        return order.getDiscountedPrice();
    }
}