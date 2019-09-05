package com.xuxi.ipcchapter.util;

import android.app.ActivityManager;
import android.content.Context;

import java.io.Closeable;
import java.io.IOException;
import java.util.List;

public class MyUtils {

    public static String getProcessName(Context cxt,int pid){

        ActivityManager am = (ActivityManager) cxt.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningAppProcessInfo> runingApps = am.getRunningAppProcesses();
        if (runingApps == null){
            return null;
        }

        for (ActivityManager.RunningAppProcessInfo processInfo : runingApps){
            if (processInfo.pid == pid){
                return processInfo.processName;
            }
        }
        return null;
    }

    public static void close(Closeable closeable){
        try {
            if (closeable != null){
                closeable.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void executeInthread(Runnable runnable){
        new Thread(runnable).start();
    }

}
