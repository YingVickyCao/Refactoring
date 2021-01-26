package com.hades.example.java.refactoring.after.c10.c10_9_introduce_parameter_object;

/**
 *  不可变类
 */
public class DateRange {
    private final Date _start;
    private final Date _end;

    public DateRange(Date start, Date end) {
        _start = start;
        _end = end;
    }

    boolean includes(Date arg) {
        return (arg.equals(_start)
                || arg.equals(_end)
                || (arg.after(_start) && arg.before(_end)));
    }
}