package com.phoenixgjh.designpattern.factory;

import android.util.Log;

import com.phoenixgjh.designpattern.factory.Sender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class MailSender implements Sender {
    private static final String TAG = "MailSender";

    @Override
    public void send() {
        Log.d(TAG, TAG);
    }
}
