package com.chenglan.myreader.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.chenglan.myreader.utils.StatusbarHelper;

/**
 * Created by 李成兰 on 2017/4/7.
 */

public class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //沉浸式
        StatusbarHelper.Builder statusbarBuidler = StatusbarHelper.from(this)
                .noActionBar(true)
                .setLightStatusBar(false)
                .setTransparentStatusbar(true)
                ;

        onStatusbarTransform(statusbarBuidler).process();
    }

    protected StatusbarHelper.Builder onStatusbarTransform(StatusbarHelper.Builder builder) {
        return builder;
    }
}
