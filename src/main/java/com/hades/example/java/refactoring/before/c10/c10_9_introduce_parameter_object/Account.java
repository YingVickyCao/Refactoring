package com.hades.example.java.refactoring.before.c10.c10_9_introduce_parameter_object;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private List<Entry> _list = new ArrayList<>();

    public Account() {
        _list.add(new Entry(new Date(5), 55));
        _list.add(new Entry(new Date(20), 100));
        _list.add(new Entry(new Date(30), 200));
        _list.add(new Entry(new Date(50), 20));
    }

    double getFlowBetween(Date start, Date end) {
        double result = 0;
        for (Entry each : _list) {
            if (each.equals(start)
                    || each.equals(end)
                    || (each.getDate().after(start) && each.getDate().before(end))) {
                result += each.getValue();
            }
        }
        return result;
    }
}
