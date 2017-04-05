package com.phoenixgjh.designpattern.adapter.classadapter;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Phoenix on 2016/9/26.
 */
public class testClassAdapterActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Ukrainian ukrainian = new ClassTranslator();
        ukrainian.sayUkrainian("BB");
    }
}
