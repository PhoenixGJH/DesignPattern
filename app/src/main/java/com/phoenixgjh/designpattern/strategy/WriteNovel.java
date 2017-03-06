package com.phoenixgjh.designpattern.strategy;

/**
 * Created by Phoenix on 2016/9/26.
 */
public class WriteNovel {
    private Synopsis mSynopsis;
    private String mString;

    public WriteNovel(String string) {
        switch (string) {
            case "AA":
                mSynopsis = new StoryA(string);
                break;
            case "BB":
                mSynopsis = new StoryB(string);
                break;
            default:
                mSynopsis = new StoryA(string);
                break;
        }
    }

    public void getDetail() {
        mSynopsis.getContent();
    }
}
