package com.chenglan.myreader.utils;

import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;

import com.chenglan.myreader.app.ReaderApplication;

import java.util.Random;

/**
 * Created by 李成兰 on 2017/4/10.
 */

public class CommonResorceUtils {

    /**
     * 随机颜色
     */
    public static int randomColor() {
        Random random = new Random();
        int red = random.nextInt(150) + 50;//50-199
        int green = random.nextInt(150) + 50;//50-199
        int blue = random.nextInt(150) + 50;//50-199
        return Color.rgb(red, green, blue);
    }

    /**
     * 获取图片资源
     * @param resid
     * @return
     */
    public static Drawable getDrawable(int resid) {
        return getResoure().getDrawable(resid);
    }

    /**
     * 获取指定颜色
     * @param resid
     * @return
     */
    public static int getColor(int resid) {
        return getResoure().getColor(resid);
    }

    public static Resources getResoure() {
        return ReaderApplication.getInstance().getResources();
    }

    /**
     * 获取Sting资源
     * @param resid
     * @return
     */
    public static String getString(int resid) {
        return getResoure().getString(resid);
    }

    /**
     * 获取尺寸
     * @param resId
     * @return
     */
    public static float getDimens(int resId) {
        return getResoure().getDimension(resId);
    }
}
