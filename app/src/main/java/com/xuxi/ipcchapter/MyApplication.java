package com.xuxi.ipcchapter;

import android.app.Application;
import android.util.Log;

import com.xuxi.ipcchapter.util.MyUtils;
import android.os.Process;

public class MyApplication extends Application {
    private static final String TAG = "MyApplication";
    @Override
    public void onCreate() {
        super.onCreate();

        Log.d(TAG, "onCreate: MyApplication");
        String processName = MyUtils.getProcessName(getApplicationContext(), Process.myPid());
        Log.d(TAG, "Application start,process name:" + processName);
        new Thread(new Runnable() {
            @Override
            public void run() {
                doWordInBackground();
            }
        }).start();


    }

    private void doWordInBackground(){
//        BinderP
    }
}
