package com.eqdd.databindpercent;

import android.app.Application;

import com.eqdd.library.percentUtil.WindowUtil;

/**
 * Created by lvzhihao on 17-4-16.
 */

public class BaseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        WindowUtil.init(this);
    }
}
