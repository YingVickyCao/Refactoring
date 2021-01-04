package com.hades.example.java.refactoring.after._c8._c8_7_change_unidirectional_association_to_bidirectional._n_custom_n_order;

import java.util.ArrayList;
import java.util.List;

/**
 * "多对多"
 * 1 个订单 可属于多 个客户， 1 个客户有多个订单
 */
public class Order {
    Customer _custom;
    List<Customer> _customers = new ArrayList<>();

    public Customer getCustom() {
        return _custom;
    }

    void setCustomer(final Customer arg) {
        arg.friendOrder().add(this);
        _customers.add(arg);
    }

    void removeCustomer(final Customer arg){
        arg.friendOrder().remove(arg);
        _customers.remove(arg);
    }
}