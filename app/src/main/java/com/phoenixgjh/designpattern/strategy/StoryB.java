package com.phoenixgjh.designpattern.strategy;

/**
 * 策略者的实现类B
 * Created by Phoenix on 2016/9/26.
 */
public class StoryB implements Synopsis {
    private String mName;

    public StoryB(String name) {
        mName = name;
    }

    @Override
    public void bedStart() {
        System.out.println(mName + "=" + "bedStart");
    }

    @Override
    public void adventure() {
        System.out.println(mName + "=" + "adventure");
    }

    @Override
    public void winABattle() {
        System.out.println(mName + "=" + "winABattle");
    }

    @Override
    public void growFast() {
        System.out.println(mName + "=" + "growFast");
    }

    @Override
    public void manyFights() {
        System.out.println(mName + "=" + "manyFights");
    }

    @Override
    public void succeed() {
        System.out.println(mName + "=" + "succeed");
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
