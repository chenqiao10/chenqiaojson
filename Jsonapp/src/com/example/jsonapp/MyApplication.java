package com.example.jsonapp;

import org.xutils.x;

import android.app.Application;

public class MyApplication  extends Application{
@Override
public void onCreate() {
	// TODO 自动生成的方法存根
	super.onCreate();
	x.Ext.init(this);
    x.Ext.setDebug(BuildConfig.DEBUG);
    
}

}
