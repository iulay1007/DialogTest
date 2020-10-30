package com.example.broadcasttest;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;

public class MainActivity2 extends AppCompatActivity {

    private String TAG="MainActivity2";

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //registerReceiver(stickyBroadcastReceiver,IntentFilter )

    }
    BroadcastReceiver stickyBroadcastReceiver=new BroadcastReceiver(){
        public void onReceive(Context context, Intent intent) {
            Log.d(TAG,"===broadcast");
        }
    };
}
