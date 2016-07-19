package com.phoenixgjh.designpattern.factory.normalfactory;

import android.util.Log;

import com.phoenixgjh.designpattern.factory.MailSender;
import com.phoenixgjh.designpattern.factory.Sender;
import com.phoenixgjh.designpattern.factory.SmsSender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class SendFactory {
    private static final String TAG = "SendFactory";

    public Sender produce(String type) {
        if (type.equalsIgnoreCase("mail")) {
            return new MailSender();
        } else if (type.equalsIgnoreCase("sms")) {
            return new SmsSender();
        } else {
            Log.e(TAG, "Wrong type");
            return null;
        }
    }
}
