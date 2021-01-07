package com.hades.example.java.refactoring.after.c8.c8_8_change_bidirectional_association_to_unidirectional;

import java.util.ArrayList;
import java.util.List;

/**
 * "1对多"
 * 1 个订单 只属于1 个客户， 1 个客户有多个订单
 */
public class Customer {
    String name;
    List<Order> _orderList = new ArrayList<>();

    static List<Customer> customerList = new ArrayList<>();

    public Customer(String name) {
        this.name = name;

        customerList.add(this);
    }

    void addOrder(Order arg) {
        _orderList.add(arg);
    }

    double getDiscount() {
        return 0.1;
    }

    double getPriceFor(Order order) {
        return order.getDiscountedPrice(this);
    }

    boolean containersOrder(Order order) {
        return _orderList.contains(order);
    }
}