package com.example.bernieshi.demoapplication;

import android.os.Message;

/**
 * Created by bernie.shi on 2016/7/24.
 */
public class MessageBean {
    public String title;
    public String user;
    public MessageBean(String title,String user){
        this.user = user;
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
    public String getUser(){
        return user;
    }
}
