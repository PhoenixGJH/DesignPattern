package com.phoenixgjh.designpattern.adapter.classadapter;

/**
 * Created by Phoenix on 2016/9/26.
 */
public class ClassTranslator extends Chinese implements Ukrainian {

    @Override
    public void sayUkrainian(String string) {
        sayChinese(string);
    }
}
