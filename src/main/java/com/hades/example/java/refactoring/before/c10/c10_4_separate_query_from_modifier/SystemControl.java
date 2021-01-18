package com.hades.example.java.refactoring.before.c10.c10_4_separate_query_from_modifier;

public class SystemControl {
    // 查询动作 + 修改动作
    String foundMiscreant(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return "Don";
            }
            if (people[i].equals("Smith")) {
                sendAlert();
                return "Smith";
            }
        }
        return "";
    }

    void checkSecurity(String[] people) {
        String found = foundMiscreant(people);
        someLaterCode(found);
    }

    void sendAlert() {
    }

    void someLaterCode(String found) {
        System.out.println(found);
    }
}
