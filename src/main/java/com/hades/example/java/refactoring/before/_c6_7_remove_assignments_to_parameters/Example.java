package com.hades.example.java.refactoring.before._c6_7_remove_assignments_to_parameters;

public class Example {
    int discount(int inputVal, int quantity, int yearToDate) {
        if (inputVal > 50)
            inputVal -= 2; // TODO:inputVal

        if (quantity > 100) {
            inputVal -= 1;// TODO:inputVal
        }
        if (yearToDate > 10000) {
            inputVal -= 4;// TODO:inputVal
        }
        return inputVal;// TODO:inputVal
    }

    // ----------------------
    void calculate() {
        int x = 5;
        triple(x);  // arg int triple:15
        System.out.println("x after triple :" + x); // x after triple :5
    }

    void triple(int arg) {
        arg = arg * 3;
        System.out.println("arg int triple:" + arg);
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
        // System.err.println("d2 after nextday:" + d2);// Date @1479534681{date=2} In support 按引用传递的语言中
    }

    // OK
    void nextDateUpdate(Date d) {
        d.setDate(d.getDate() + 1);
        System.err.println("arg in nextday d1 : " + d);
    }

    void nextDateReplace(Date d) {
        d = new Date(d.getDate() + 1);
        System.err.println("arg in nextday d2: " + d);
    }
}
