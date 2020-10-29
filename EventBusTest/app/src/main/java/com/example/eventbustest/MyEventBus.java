package com.example.eventbustest;

import org.greenrobot.eventbus.EventBus;

public class MyEventBus extends EventBus {
    private int position;
    public MyEventBus(int position){
        this.position=position;

    }
    public int getPosition(){
        return position;
    }
    public void setPosition(int position){

        this.position=position;
    }
}
