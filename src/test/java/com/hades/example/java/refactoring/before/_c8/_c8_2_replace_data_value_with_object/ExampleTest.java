package com.hades.example.java.refactoring.before._c8._c8_2_replace_data_value_with_object;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ExampleTest {
    @Test
    public void numberOfOrdersFor() {
        Order order1 = new Order("Customer_A");
        Order order2 = new Order("Customer_A");
        Order order3 = new Order("Customer_B");

        List<Order> list = new ArrayList<>();
        list.add(order1);
        list.add(order2);
        list.add(order3);

        Example example = new Example();
        int num = example.numberOfOrdersFor(list, "Customer_A");
        Assert.assertEquals(2, num);
    }
}