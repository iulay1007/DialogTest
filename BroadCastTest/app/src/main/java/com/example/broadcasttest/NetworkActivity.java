package com.example.broadcasttest;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class NetworkActivity extends AppCompatActivity {

    private static final String TAG ="NetworkActivity" ;
    private IntentFilter intentFilter;
    private NetworkChangeReceiver networkChangeReceiver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        注册监听网络变化

        intentFilter = new IntentFilter();
        intentFilter.addAction("com.sample.test.sticky.broadcast.receiver");
        networkChangeReceiver = new NetworkChangeReceiver();
        //绑定监听
        registerReceiver(networkChangeReceiver,intentFilter);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        //取消绑定
        unregisterReceiver(networkChangeReceiver);
    }

    class NetworkChangeReceiver extends BroadcastReceiver {
        //实现接收到广播的处理
        @Override
        public void onReceive(Context context, Intent intent) {

            Log.d(TAG,"===NetworkChangeReceiver");
        }
    }
}