package com.example.bernieshi.demoapplication;

import android.content.Context;

import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class DemoRetrofit {
    public static <T> T create(final Class<T> cls,String webSite,OkHttpClient.Builder build) {
        OkHttpClient okHttpClient = build.build();
        Retrofit.Builder builder = new Retrofit.Builder();
        Retrofit retrofit = builder
                .baseUrl(webSite)//注意此处,设置服务器的地址
                .addConverterFactory(GsonConverterFactory.create())//用于Json数据的转换,非必须
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())//用于返回Rxjava调用,非必须
                .client(okHttpClient)
                .build();
        return retrofit.create(cls);
    }

}