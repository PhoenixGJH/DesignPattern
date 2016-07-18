package com.phoenixgjh.designpattern.observerpattern;

/**
 * Created by Phoenix on 2016/7/18.
 */
public interface Subject<T> {
    /**
     * 添加观察者
     *
     * @param observer
     */
    void addObserver(Observer observer);

    /**
     * 移除观察者
     *
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 移除所有观察者
     */
    void removeAll();

    /**
     * 通知观察者
     *
     * @param t
     */
    void notifyAllObserver(T t);

    /**
     * 通知特定的观察者
     *
     * @param observer
     * @param t
     */
    void nofityObserver(Observer observer, T t);
}
