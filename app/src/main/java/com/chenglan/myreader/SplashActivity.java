package com.chenglan.myreader;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.chenglan.myreader.base.BaseActivity;
import com.chenglan.myreader.databinding.ActivitySplashBinding;
import com.chenglan.myreader.utils.GlideImageLoader;

import java.util.ArrayList;

public class SplashActivity extends BaseActivity implements View.OnClickListener {
    private ActivitySplashBinding mDataBing;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mDataBing= DataBindingUtil.setContentView(this,R.layout.activity_splash);

        //用banner实现首页轮播
        ArrayList<Integer> mDrawables = new ArrayList<>();
        mDrawables.add(R.mipmap.b_1);
        mDrawables.add(R.mipmap.b_2);
        mDrawables.add(R.mipmap.b_3);
        mDataBing.bannerSplash.setImages(mDrawables).setImageLoader(new GlideImageLoader()).start();
        
        //点击进入主界面
        mDataBing.into.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}
