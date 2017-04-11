package com.chenglan.myreader.app;

import android.app.Application;

/**
 * Created by 李成兰 on 2017/4/10.
 */

public class ReaderApplication extends Application {

    private static ReaderApplication readerApplication;

    public static ReaderApplication getInstance() {
        return readerApplication;
    }

    @SuppressWarnings("unused")
    @Override
    public void onCreate() {
        super.onCreate();
        readerApplication = this;
//        HttpUtils.getInstance().init(this, DebugUtil.DEBUG);

        initTextSize();
    }

    /**
     * 使其系统更改字体大小无效
     */
    private void initTextSize() {
//        Resources res = getResources();
//        Configuration config = new Configuration();
//        config.setToDefaults();
//        res.updateConfiguration(config, res.getDisplayMetrics());
    }

}
