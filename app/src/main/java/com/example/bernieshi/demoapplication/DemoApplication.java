package com.example.bernieshi.demoapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class DemoApplication extends Application {
    public static DemoApplication instance = null;
    public static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static DemoApplication getInstance() {
        if (instance == null) {
            synchronized (DemoApplication.class) {
                if (instance == null) {
                    instance = new DemoApplication();
                }
            }
        }
        return instance;
    }
}
