package com.example.bernieshi.demoapplication;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.bernieshi.demoapplication.databinding.ActivityDemoBinding;

import java.util.HashMap;
import java.util.Map;

public class DemoActivity extends BaseActivity implements DataListener{
    ActivityDemoBinding binding;
    DataBean dataBean;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_demo);
        dataBean = new DataBean();
        binding.setData(dataBean);
        binding.setHandler(this);
    }
    public void click(View view) {
        GetDataFromClient dataFromClient = new GetDataFromClient(this);
        Map<Object, Object> params = new HashMap<>();
        params.put("version", "1.3.0");
        params.put("client", "Android");
        dataFromClient.getDataFromClient(demoApiService,params);
    }

    @Override
    public void dataResponse(DataBean dataBean) {
        this.dataBean.setDownloadUrl(dataBean.downloadUrl);
        this.dataBean.setNewVersion(dataBean.newVersion);
    }
}
