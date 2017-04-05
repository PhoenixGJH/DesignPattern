package com.phoenixgjh.designpattern.decoration;

import android.util.Log;

/**
 * Created by Phoenix on 2017/3/8.
 */

public class SuperPerson {
    Person person;

    public SuperPerson(Person person) {
        this.person = person;
    }

    public void eat() {
        person.eat();
        Log.d("GJH", ",睡觉，打豆豆");
    }
}
