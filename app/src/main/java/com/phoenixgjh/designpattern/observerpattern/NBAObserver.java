package com.phoenixgjh.designpattern.observerpattern;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by Phoenix on 2016/7/18.
 */
public class NBAObserver implements Observer<String> {
    private static final String TAG = "NBAObserver";

    @Override
    public void update(Subject subject, String s) {
        Log.d(TAG, getClass().getSimpleName() + ":" + s);
    }
}
