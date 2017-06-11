package com.jason.designpattern.extendmodel;

/**
 * Created by Administrator on 2017/6/11.
 */
public abstract class HummerModel {

    private boolean isAlarm;

    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();
    public void run(){
        this.start();
        if(isAlarm()){
            this.alarm();
        }
        this.engineBoom();
        this.stop();
    }

    public abstract void setAlarmFlag(boolean alarmFlag);

    protected boolean isAlarm(){
        return true;
    }
}
