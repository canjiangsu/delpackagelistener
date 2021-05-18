package com.socsi.delpackagelistener;

import android.app.Service;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {
    private static final String TAG = "DelPackageListener.MyService";
    private MyReceiver mReceiver;

    public MyService() {
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mReceiver = new MyReceiver();
        Log.d(TAG, "onCreate");
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public int onStartCommand(Intent pIntent, int pFlags, int pStartId) {
        Log.d(TAG, "onStartCommand");
        registerReceiver();
        return Service.START_STICKY;
    }

    private void registerReceiver() {
        IntentFilter screenFilter = new IntentFilter();
        screenFilter.addAction(Intent.ACTION_SCREEN_OFF);
        screenFilter.addAction(Intent.ACTION_SCREEN_ON);
        screenFilter.addAction(Intent.ACTION_DELETE);
        this.registerReceiver(mReceiver, screenFilter);
    }
}
