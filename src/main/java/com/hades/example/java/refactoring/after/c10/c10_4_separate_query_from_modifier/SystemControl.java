package com.hades.example.java.refactoring.after.c10.c10_4_separate_query_from_modifier;

public class SystemControl {
    // 查询动作
    // synchronized void foundMiscreant(String[] people) {
    //    void foundMiscreant(String[] people) {
    void sendAlert(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                sendAlert();
                return;
            }
            if (people[i].equals("Smith")) {
                sendAlert();
                return;
            }
        }
    }

    // 修改动作
    // synchronized String foundPerson(String[] people) {
    String foundPerson(String[] people) {
        for (int i = 0; i < people.length; i++) {
            if (people[i].equals("Don")) {
                return "Don";
            }
            if (people[i].equals("Smith")) {
                return "Smith";
            }
        }
        return "";
    }

    void checkSecurity(String[] people) {
        // 先调用修改函数
        String found = foundPerson(people);
        if (!found.equals("")) {
            // 然后调用查询函数
            sendAlert(people);
        }
        someLaterCode(found);
    }

    void sendAlert() {
    }

    void someLaterCode(String found) {
        System.out.println(found);
    }
}