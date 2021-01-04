package com.hades.example.java.refactoring.after._c8._c8_8_change_bidirectional_association_to_unidirectional;


public class Order {
    // Way2 ： 修改取值函数
    // 如何返回它的Customer？
    public Customer getCustom() {
        for (Customer each : Customer.customerList) {
            if (each.containersOrder(this)) {
                return each;
            }
        }
        return null;
    }

    // Way1 :作为参数传递
    double getDiscountedPrice(Customer customer) {
        return getCrossPrice() * (1 - customer.getDiscount());
    }
    double getCrossPrice() {
        return 255;
    }
}