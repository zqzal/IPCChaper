package com.xuxi.ipcchapter.model;

import android.os.Parcel;

import java.io.Serializable;

public class User implements Serializable {

    public int userId;
    public String userName;
    public boolean isMale;

    public User(int userId, String userName, boolean isMale) {
        this.userId = userId;
        this.userName = userName;
        this.isMale = isMale;
    }

    public int describeContents(){
        return 0;
    }

//    public void writhToParcel(Parcel out,int flags){
//        out.writeInt(userId);
//        out.writeString(userName);
//        out.writeInt(isMale ? 1 : 0);
//        out.writeParcelable();
//    }

}
