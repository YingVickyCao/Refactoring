package com.hades.example.java.refactoring.before.c8.c8_8_change_bidirectional_association_to_unidirectional;

public class Example {
    public static void main(String[] args) {
        Customer custom = new Customer("custom");
        Order order1 = new Order();
        Order order2 = new Order();

        custom.addOrder(order1);
        custom.addOrder(order2);
        System.out.println(custom.getPriceFor(order2));;
    }
}
