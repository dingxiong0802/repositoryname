package com.m_lou.comonview;

import android.content.Context;
import android.view.WindowManager;

/**
 * Created by hacker on 2017/9/30.
 * 微信:515706398
 */

public class CommonViewUtil {
    private static WindowManager.LayoutParams windowParams;

    private static Context context;
    public static void init(Context mcontext){
        context=mcontext;
        windowParams = new WindowManager.LayoutParams();
    }
    public static Context getContext(){
        return context;
    }
    public static WindowManager.LayoutParams getWindowParams() {
        return windowParams;
    }
}
