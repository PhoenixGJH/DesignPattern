package com.phoenixgjh.designpattern.observerpattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Phoenix on 2016/7/18.
 */
public class ConcreteSubject implements Subject<String> {
    private List<Observer> mLists = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("observer is null");
        }
        if (!mLists.contains(observer)) {
            mLists.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        if (mLists.contains(observer))
            mLists.remove(observer);
    }

    @Override
    public void removeAll() {
        mLists.clear();
    }

    @Override
    public void notifyAllObserver(String s) {
        for (Observer observer : mLists) {
            observer.update(this, s);
        }
    }

    @Override
    public void notifyObserver(Observer observer, String s) {
        if (observer != null) {
            observer.update(this, s);
        }
    }

}
