package com.hades.example.java.refactoring.before._c6_8_replace_method_with_method_object;

public class Account {
    //Class Account
    // TODO: para num is 7
    public int gamma(int inputVal, int quantity, int yearToDate) {
        int importantValue1 = (inputVal * quantity) + delta();
        int importantValue2 = (inputVal * yearToDate) + 100;
        if ((yearToDate - importantValue1) > 100)
            importantValue2 -= 20;
        int importantValue3 = importantValue2 * 7;
        // and so on...
        return importantValue3 - 2 * importantValue1;
    }

    int delta() {
        return 10;
    }
}