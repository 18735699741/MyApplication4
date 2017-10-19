package com.example.administrator.myapplication.app.application;


import android.app.Application;

import com.yanzhenjie.nohttp.BuildConfig;
import com.yanzhenjie.nohttp.NoHttp;
import org.xutils.x;
/**
 * Created by wangye on 2017/10/17.
 */

public class MyApp extends Application {
  public int a = 1;
  @Override
  public void onCreate() {
    super.onCreate();
    NoHttp.initialize(this);
    x.Ext.init(this);
//    x.Ext.setDebug(BuildConfig.DEBUG);

  }

  public int getA() {
    return a;
  }

  public void setA(int a) {
    this.a = a;
  }
}
