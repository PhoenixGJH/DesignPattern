package com.phoenixgjh.designpattern.signal;

/**
 * 饿汉式单例模式
 * Created by Phoenix on 2016/7/19.
 */
public class Hungrypattern {
    private static final Hungrypattern instance = new Hungrypattern();

    private Hungrypattern() {

    }

    public static Hungrypattern getInstance() {
        return instance;
    }
}
