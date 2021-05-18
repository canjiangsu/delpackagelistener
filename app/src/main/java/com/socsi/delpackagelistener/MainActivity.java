package com.socsi.delpackagelistener;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "DelPackageListener";
    private Intent mService;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Intent intent = getIntent();
        Log.d(TAG, "Action: " + intent.getAction());
        mService = new Intent(this, MyService.class);
        this.startService(mService);
    }
}
