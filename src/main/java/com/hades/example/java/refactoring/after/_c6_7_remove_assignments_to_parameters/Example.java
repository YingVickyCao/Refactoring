package com.hades.example.java.refactoring.after._c6_7_remove_assignments_to_parameters;

public class Example {
    int discount(final int inputVal, final int quantity, final int yearToDate) {
        int result = inputVal;
        if (inputVal > 50)
            result -= 2;

        if (quantity > 100) {
            result -= 1;
        }
        if (yearToDate > 10000) {
            result -= 4;
        }
        return result;
    }

    // ----------------------
    void calculate() {
        int x = 5;
        triple(x);  // arg int triple:15
        System.out.println("x after triple :" + x); // x after triple :5
    }

    void triple(final int arg) {
        System.out.println("arg int triple:" + arg * 3);
    }

    // ----------------------
    void passedParamIsObject() {
        Date d1 = new Date(1);
        System.err.println(d1);                         // Date @1363977817{date=1}
        nextDateUpdate(d1);                             // Date @1363977817{date=2}
        System.err.println("d1 after nextday:" + d1);   // Date @1363977817{date=2}

        Date d2 = new Date(1);
        System.err.println(d2);                         // Date @4639787{date=1}
        nextDateReplace(d2);                            // Date @1479534681{date=2}
        System.err.println("d2 after nextday:" + d2);   // Date @4639787{date=1}    In support 按值传递的语言中

//        Date result  = nextDateReplace(d2);           // Date @1479534681{date=2}
        // System.err.println("d2 after nextday:" + result);// Date @1479534681{date=2} In support 按引用传递的语言中
    }

    // OK
    void nextDateUpdate(Date d) {
        d.setDate(d.getDate() + 1);
        System.err.println("arg in nextday d1 : " + d);
    }

    // OK: In support 按值传递的语言中
    void nextDateReplace(Date d) {
        Date print = new Date(d.getDate() + 1);
        System.err.println("arg in nextday d2: " + print);
    }

    // OK: In support 按引用传递的语言中
//    Date nextDateReplace(Date d) {
//        Date print = new Date(d.getDate() + 1);
//        System.err.println("arg in nextday d2: " + print);
//        return print;
//    }

    // Clone/Copy
    Date clone(Date d) {
        Date result = new Date(d.getDate() + 1);
        return result;
    }
}
