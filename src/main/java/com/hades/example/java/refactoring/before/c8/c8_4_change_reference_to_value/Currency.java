package com.hades.example.java.refactoring.before.c8.c8_4_change_reference_to_value;

import java.util.HashMap;
import java.util.Map;

// 货币种类
public class Currency {
    private String code;
    private static Map<String, Currency> map = new HashMap<>();

    public static void init() {
        map.put("CNY", new Currency("CNY"));
        map.put("USD", new Currency("USD"));
    }

    public static Currency get(String code) {
        return map.get(code);
    }
    
    private Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}