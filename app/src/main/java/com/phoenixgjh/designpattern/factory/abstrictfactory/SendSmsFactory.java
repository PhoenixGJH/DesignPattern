package com.phoenixgjh.designpattern.factory.abstrictfactory;

import com.phoenixgjh.designpattern.factory.Sender;
import com.phoenixgjh.designpattern.factory.SmsSender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class SendSmsFactory implements Provider {
    @Override
    public Sender produce() {
        return new SmsSender();
    }
}
