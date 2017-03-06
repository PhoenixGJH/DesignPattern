package com.phoenixgjh.designpattern.adapter.objectadapter;

/**
 * 翻译
 * Created by Phoenix on 2016/9/26.
 */
public class Translator implements Ukrainian {
    private Chinese mChinese;

    public Translator(Chinese chinese) {
        mChinese = chinese;
    }

    @Override
    public void sayUkrainian(String string) {
        mChinese.sayChinese(string);
    }
}
