package com.phoenixgjh.designpattern.factory.mulityfactory;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.phoenixgjh.designpattern.R;
import com.phoenixgjh.designpattern.factory.Sender;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class FactoryTestActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    /**
     * 多工厂模式
     */
    private void init() {
        SendFactory factory = new SendFactory();
        Sender sender = factory.produceMail();
        sender.send();
    }
}
