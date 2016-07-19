package com.phoenixgjh.designpattern.factory.abstrictfactory;

import com.phoenixgjh.designpattern.factory.MailSender;
import com.phoenixgjh.designpattern.factory.Sender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class SendMailFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
