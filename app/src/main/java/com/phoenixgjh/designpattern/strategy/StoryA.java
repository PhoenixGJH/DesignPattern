package com.phoenixgjh.designpattern.strategy;

/**
 * 策略者的实现类A
 * Created by Phoenix on 2016/9/26.
 */
public class StoryA implements Synopsis {
    private String mName;

    public StoryA(String name) {
        mName = name;
    }

    @Override
    public void bedStart() {
        System.out.println(mName + "_" + "bedStart");
    }

    @Override
    public void adventure() {
        System.out.println(mName + "_" + "adventure");
    }

    @Override
    public void winABattle() {
        System.out.println(mName + "_" + "winABattle");
    }

    @Override
    public void growFast() {
        System.out.println(mName + "_" + "growFast");
    }

    @Override
    public void manyFights() {
        System.out.println(mName + "_" + "manyFights");
    }

    @Override
    public void succeed() {
        System.out.println(mName + "_" + "succeed");
    }

    @Override
    public void getContent() {
        bedStart();
        adventure();
        winABattle();
        growFast();
        manyFights();
        succeed();
    }
}
