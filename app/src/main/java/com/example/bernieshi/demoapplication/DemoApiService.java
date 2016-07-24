package com.example.bernieshi.demoapplication;

import org.json.JSONObject;

import java.util.Map;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import rx.Observable;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public interface DemoApiService {

    @GET("/api")
    Call<ResponseBean> getApi(@Query("pa1") String va1, @Query("ba1") String va2);

    @POST("/api")
    Call<ResponseBean> postApi(@Body RequestBean requestBean);

    @GET("/api")
    Call<ResponseBody> getApiString(@QueryMap Map<String, String> params);

    @POST("parleyserver/user/getpin")
    Call<DataBean> getInfo(@Body Map<Object, Object> params);

    @POST("parleyserver/user/login")
    Call<DataBean> sendPhoneNumber(@Body Map<Object, Object> params);

    @POST("/api")
    Call<ResponseBody> postApiString(@Body RequestBean requestBean);

    @GET("/api")
    Observable<ResponseBody> getRxApiString(@QueryMap Map<Object, Object> params);

    @POST("parleyserver/user/checkversion")
    Observable<DataBean> postRxApiString(@Body Map<Object, Object> params);

    public class ResponseBean {

    }

    public class RequestBean {

    }
}
