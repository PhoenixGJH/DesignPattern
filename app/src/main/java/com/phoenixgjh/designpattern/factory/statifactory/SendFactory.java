package com.phoenixgjh.designpattern.factory.statifactory;

import com.phoenixgjh.designpattern.factory.MailSender;
import com.phoenixgjh.designpattern.factory.Sender;
import com.phoenixgjh.designpattern.factory.SmsSender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class SendFactory {
    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
