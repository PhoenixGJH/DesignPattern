package com.phoenixgjh.designpattern.signal;

/**
 * 懒汉式单例模式
 * Created by Phoenix on 2016/7/19.
 */
public class Lazypattern {
    private static Lazypattern instance;

    private Lazypattern() {

    }

    public static Lazypattern getInstance() {
        if (instance == null) {
            synchronized (Lazypattern.class) {
                if (instance == null) {
                    instance = new Lazypattern();
                }
            }
        }
        return instance;
    }
}
