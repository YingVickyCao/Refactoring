package com.hades.example.java.refactoring.before._c7._c7_3_extact_class;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {

    @Test
    public void getTelephoneNumber() {
        Person person = new Person();
        person.setOfficeAreaCode("+86");
        person.setOfficeNumber("12345678");
        Assert.assertEquals("(+86) 12345678", person.getTelephoneNumber());
    }
}