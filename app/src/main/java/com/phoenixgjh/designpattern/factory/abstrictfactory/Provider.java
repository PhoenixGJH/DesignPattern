package com.phoenixgjh.designpattern.factory.abstrictfactory;

import com.phoenixgjh.designpattern.factory.Sender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public interface Provider {
    Sender produce();
}
