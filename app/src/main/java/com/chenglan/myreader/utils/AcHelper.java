package com.chenglan.myreader.utils;

import android.app.Activity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by 李成兰 on 2017/4/7.
 */

public class AcHelper {

    public static void fullScreen(Activity ac, boolean b) {
        Window window = ac.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        int flag = WindowManager.LayoutParams.FLAG_FULLSCREEN;

        if (b) {
            attributes.flags |= flag;
        } else {
            attributes.flags &= ~flag;
        }
        window.setAttributes(attributes);
    }

}
