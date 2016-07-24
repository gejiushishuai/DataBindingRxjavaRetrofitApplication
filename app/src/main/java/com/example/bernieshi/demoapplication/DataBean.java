package com.example.bernieshi.demoapplication;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.example.bernieshi.demoapplication.BR;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class DataBean extends BaseObservable {
    public int retCode;
    public int isMustUpdate;
    public String newVersion;
    public String downloadUrl;
    public String remark;
    public String token;
    @Bindable
    public String getToken() {
        return token;
    }
    public void setToken(String token) {
        this.token = token;
        notifyPropertyChanged(BR.token);
    }
    public void setIsMustUpdate(int isMustUpdate) {
        this.isMustUpdate = isMustUpdate;
        notifyPropertyChanged(BR.isMustUpdate);
    }
    @Bindable
    public int getIsMustUpdate() {
        return isMustUpdate;
    }
    @Bindable
    public String getNewVersion() {
        return newVersion;
    }
    public void setNewVersion(String newVersion) {
        this.newVersion = newVersion;
        notifyPropertyChanged(BR.newVersion);
    }
    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
        notifyPropertyChanged(BR.downloadUrl);
    }
    @Bindable
    public String getRemark() {
        return remark;
    }
    public void setRemark(String remark) {
        this.remark = remark;
        notifyPropertyChanged(BR.remark);
    }
    @Bindable
    public String getDownloadUrl() {
        return downloadUrl;
    }
    public void setRetCode(int retCode) {
        this.retCode = retCode;
        notifyPropertyChanged(BR.retCode);
    }
    @Bindable
    public int getRetCode() {
        return this.retCode;
    }
}
