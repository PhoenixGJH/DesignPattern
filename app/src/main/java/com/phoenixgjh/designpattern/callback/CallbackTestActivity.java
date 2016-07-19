package com.phoenixgjh.designpattern.callback;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.phoenixgjh.designpattern.R;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class CallbackTestActivity extends AppCompatActivity implements DefAlertDialog.OnPositiveClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        DefAlertDialog dialog = new DefAlertDialog(this, "Message", "you have a message");
        dialog.setOnClickListener(this);
        dialog.show();
    }

    @Override
    public void onPositiveClick() {
        Toast.makeText(this, "OK is clicked", Toast.LENGTH_SHORT).show();
    }
}
