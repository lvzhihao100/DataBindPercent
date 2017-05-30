package com.eqdd.databind.percent;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * Created by vzhihao on 2016/7/13.
 */
public class WindowUtil {
    private static Context context;
    private static int statusBarHeight;
    public static  int width=640;
    public static  int height = 1136;
    public static int csw;
    public static  int csh;
    public static  int density;

    public WindowUtil(Context context) {
        this.context = context;
    }

    public static void init(Context context) {
        init(context,width,height);
    }

    public static void init(Context context,int width,int height) {
        DisplayMetrics dm = context.getResources().getDisplayMetrics();
        csw = dm.widthPixels;
        csh =dm.heightPixels;
        density=(int)dm.density;
        WindowUtil.width=width;
        WindowUtil.height=height;
        statusBarHeight= Resources.getSystem().getDimensionPixelSize(
                Resources.getSystem().getIdentifier("status_bar_height", "dimen", "android"));
    }
//    public static int getTop(View view) {
//        int[] ints = new int[2];
//        view.getLocationInWindow(ints);
//        return  ints[1];
//    }
}
