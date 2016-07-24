package com.example.bernieshi.demoapplication;

import android.content.Context;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class DemoOkHttpClientBuilder {

    public OkHttpClient.Builder getBuilder(Context context) {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.networkInterceptors()
                .add(new DemoCookiesInterceptor(context));
        builder.connectTimeout(15, TimeUnit.SECONDS);
        builder.readTimeout(20, TimeUnit.SECONDS);
        builder.writeTimeout(20, TimeUnit.SECONDS);
        return builder;
    }
}
