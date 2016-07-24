package com.example.bernieshi.demoapplication;

import java.util.Map;

import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class GetDataFromClient {
    DataListener dataListener;
    public GetDataFromClient(DataListener dataListener){
        this.dataListener = dataListener;
    }
    public  void getDataFromClient(DemoApiService demoApiService ,Map<Object, Object> params){
        demoApiService.postRxApiString(params)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<DataBean>() {
                    @Override
                    public void onNext(DataBean dataBean) {
                        dataListener.dataResponse(dataBean);
                    }
                    @Override
                    public void onCompleted() {

                    }
                    @Override
                    public void onError(Throwable e) {

                    }
                });
    }
}
