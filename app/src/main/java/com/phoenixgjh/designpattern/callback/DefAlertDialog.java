package com.phoenixgjh.designpattern.callback;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.text.TextPaint;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;

import com.phoenixgjh.designpattern.R;

/**
 * Created by Phoenix on 2016/7/19.
 */
public class DefAlertDialog extends AlertDialog implements View.OnClickListener {
    private Context mContext;

    private TextView mTV_title;
    private TextView mTV_content;
    private CharSequence mTitle;
    private CharSequence mContent;

    private OnPositiveClickListener mPositiveClickListener;

    /**
     * 确定按钮点击的回调接口
     */
    public interface OnPositiveClickListener {
        void onPositiveClick();
    }

    public DefAlertDialog(Context context, CharSequence mContent, CharSequence mTitle) {
        super(context);
        this.mContext = context;
        this.mContent = mContent;
        this.mTitle = mTitle;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBlurEffect();
        init();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.text_def_alert_dialog_positive:
                if (mPositiveClickListener != null) {
                    mPositiveClickListener.onPositiveClick();
                }
                break;
            case R.id.text_def_alert_dialog_negative:
                dismiss();
                break;
        }
    }

    /**
     * 设置灰色模糊效果
     */
    protected void setBlurEffect() {
        Window window = getWindow();
        WindowManager.LayoutParams params = window.getAttributes();
        params.dimAmount = 0.6f;
        window.setAttributes(params);
        window.addFlags(WindowManager.LayoutParams.FLAG_DIM_BEHIND);
    }

    public void setTitle(CharSequence title) {
        mTitle = title;
        mTV_title.setText(mTitle);
    }

    public void setTitle(int resId) {
        mTitle = mContext.getResources().getText(resId);
        mTV_title.setText(mTitle);
    }

    public void setMessage(CharSequence msg) {
        mContent = msg;
        mTV_content.setText(mContent);
    }

    public void setMessage(int resId) {
        mContent = mContext.getResources().getText(resId);
        mTV_content.setText(mContent);
    }

    public void setOnClickListener(OnPositiveClickListener listener) {
        mPositiveClickListener = listener;
    }

    private void init() {
        setContentView(R.layout.def_alert_dialog);
        mTV_title = (TextView) findViewById(R.id.text_def_alert_dialog_title);
        TextPaint tp = mTV_title.getPaint();
        tp.setFakeBoldText(true);
        mTV_title.setText(mTitle);

        mTV_content = (TextView) findViewById(R.id.text_def_alert_dialog_content);
        mTV_content.setText(mContent);

        TextView tv_positive = (TextView) findViewById(R.id.text_def_alert_dialog_positive);
        tv_positive.setOnClickListener(this);

        TextView tv_negative = (TextView) findViewById(R.id.text_def_alert_dialog_negative);
        tv_negative.setOnClickListener(this);
    }
}
