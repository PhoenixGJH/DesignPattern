package com.phoenixgjh.designpattern.strategy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.phoenixgjh.designpattern.R;
import com.phoenixgjh.designpattern.strategy.WriteNovel;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        strategy();
    }

    /**
     * 策略者模式的实现
     */
    private void strategy() {
        WriteNovel novel = new WriteNovel("AA");
        novel.getDetail();
    }
}
