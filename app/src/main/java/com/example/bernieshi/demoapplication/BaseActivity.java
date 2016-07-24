package com.example.bernieshi.demoapplication;

import android.app.Activity;
import android.os.Bundle;

import rx.Observable;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class BaseActivity extends Activity {
    Observable<String> addOb;
    DemoApiService demoApiService ;
    protected void onCreate(Bundle onSaveStateInstance){
        super.onCreate(onSaveStateInstance);
        DemoOkHttpClientBuilder demoOkHttpClientBuilder = new DemoOkHttpClientBuilder();
        demoApiService = DemoRetrofit.create(DemoApiService.class, "http://www888.rollit.me/", demoOkHttpClientBuilder.getBuilder(getApplicationContext()));
    }
    @Override
    protected void onResume(){
        super.onResume();
        addOb = DemoRxBus.get().register("addFeedTag", String.class);
    }
    @Override
    protected void onStop(){
        super.onStop();
        DemoRxBus.get().unregister("addFeedTag", addOb);
    }
}
