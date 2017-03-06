package com.phoenixgjh.designpattern.adapter.objectadapter;

import android.app.Activity;
import android.os.Bundle;

/**
 * Created by Phoenix on 2016/9/26.
 */
public class AdapterTest extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        testAdapterPattern();
    }

    private void testAdapterPattern() {
        Chinese chinese = new Chinese();
        Ukrainian ukrainian = new Translator(chinese);
        ukrainian.sayUkrainian("AA");
    }
}
