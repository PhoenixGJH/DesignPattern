package com.phoenixgjh.designpattern.strategy;

/**
 * Created by Phoenix on 2016/9/26.
 */
public class WriteNovel {
    private Synopsis mSynopsis;
    private String mString;

    public WriteNovel(String string) {
        mSynopsis = new StoryA(string);
    }

    public void getDetail() {
        mSynopsis.getContent();
    }
}
