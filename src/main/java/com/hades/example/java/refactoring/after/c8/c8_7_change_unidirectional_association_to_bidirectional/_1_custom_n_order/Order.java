package com.hades.example.java.refactoring.after.c8.c8_7_change_unidirectional_association_to_bidirectional._1_custom_n_order;

public class Order {
    Customer _custom;

    public Customer getCustom() {
        return _custom;
    }

    // 在Order中修改连接。
    // 先对方删除指向你的指针，再将你的指针指向一个新对象，最后让那个新对象把它的指针指向你。
    void setCustomer(Customer arg) {
        if (_custom != null) {
            _custom.friendOrder().remove(this);
        }
        _custom = arg;
        if (_custom != null) {
            _custom.friendOrder().add(this);
        }
    }
}