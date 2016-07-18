package com.phoenixgjh.designpattern.observerpattern;

/**
 * 观察者接口
 * Created by Phoenix on 2016/7/18.
 */
public interface Observer<T> {
    void update(Subject subject, T t);
}
