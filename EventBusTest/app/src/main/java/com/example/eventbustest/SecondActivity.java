package com.example.eventbustest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

public class SecondActivity extends AppCompatActivity {
    private TextView textView;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_layout);
        textView=(TextView)findViewById(R.id.tv);

        EventBus.getDefault().register(this);


    }

    @Subscribe(threadMode = ThreadMode.MAIN,sticky = true)
    public void Event(MyEventBus myEventBus){
      //  textView.setText(String.format("%d", myEventBus.getPosition()));
        textView.setText(myEventBus.getPosition()+"");
        position=myEventBus.getPosition();
        position=position+2;
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(EventBus.getDefault().isRegistered(this)){

            EventBus.getDefault().unregister(this);
        }
    }

    public void to_first_activity(View view) {
        //Intent intent=new Intent(SecondActivity.this,MainActivity.class);
        //startActivity(intent);
        EventBus.getDefault().postSticky(new MyEventBus(position));

    }
}