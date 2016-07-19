package com.phoenixgjh.designpattern.factory.mulityfactory;

import com.phoenixgjh.designpattern.factory.MailSender;
import com.phoenixgjh.designpattern.factory.Sender;
import com.phoenixgjh.designpattern.factory.SmsSender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class SendFactory {
    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
