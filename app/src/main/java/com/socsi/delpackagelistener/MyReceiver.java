package com.socsi.delpackagelistener;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class MyReceiver extends BroadcastReceiver {
    private static final String TAG = "DelPackageListener.MyReceiver";

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, "Action: " + intent.getAction());
    }
}
