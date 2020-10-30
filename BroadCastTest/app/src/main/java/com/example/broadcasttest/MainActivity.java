package com.example.broadcasttest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }


    @Override
    protected void onResume() {
        super.onResume();
        getWindow().getDecorView().postDelayed(new Runnable() {

            @Override
            public void run() {
                sendStickyBroadcast();
            }
        }, 3*1000);
    }

    private void sendStickyBroadcast()
    {
        Intent i = new Intent();
        i.setAction("com.sample.test.sticky.broadcast.receiver");
        i.putExtra("info", "sticky broadcast has been receiver");
        sendStickyBroadcast(i);
        Log.i("Other","sticky broadcast send ok!");
    }

    public void tz(View view) {
        Intent intent=new Intent(MainActivity.this,NetworkActivity.class);
        startActivity(intent);
    }
}

