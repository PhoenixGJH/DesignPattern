package com.phoenixgjh.designpattern.signal;

/**
 * 一种单例模式
 * Created by Phoenix on 2017/2/28.
 */

public class Singlepattern {
    private Singlepattern() {

    }

    public static Singlepattern getInstance() {
        return SingleHolder.instance;
    }

    private static class SingleHolder {
        private static final Singlepattern instance = new Singlepattern();
    }
}
