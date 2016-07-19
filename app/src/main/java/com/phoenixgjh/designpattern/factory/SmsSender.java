package com.phoenixgjh.designpattern.factory;

import android.util.Log;

import com.phoenixgjh.designpattern.factory.Sender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class SmsSender implements Sender {
    private static final String TAG = "SmsSender";

    @Override
    public void send() {
        Log.d(TAG, TAG);
    }
}
