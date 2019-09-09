package com.xuxi.ipcchapter.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public class Book implements Parcelable {
    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

    }
}
