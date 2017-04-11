package com.chenglan.myreader.utils;

import android.content.Context;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.youth.banner.loader.ImageLoader;

/**
 * Created by 李成兰 on 2017/4/7.
 * 首页轮播
 */

public class GlideImageLoader extends ImageLoader {
    @Override
    public void displayImage(Context context, Object path, ImageView imageView) {
        Glide.with(context).load(path)/*.placeholder(R.mipmap.img_two_bi_one)
                .error(R.mipmap.img_two_bi_one)*/
                .crossFade(1000)
                .into(imageView);
    }
}
