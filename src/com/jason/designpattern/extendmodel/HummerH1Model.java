package com.jason.designpattern.extendmodel;

/**
 * Created by Administrator on 2017/6/11.
 */
public class HummerH1Model extends HummerModel {

    private boolean alarmFlag;

    @Override
    public void start() {
        System.out.println("H1 starts ...");
    }

    @Override
    public void stop() {
        System.out.println("H1 stops ...");
    }

    @Override
    public void alarm() {
        System.out.println("H1 alarms ...");
    }

    @Override
    public void engineBoom() {
        System.out.println("H1 booms ...");
    }

    protected boolean isAlarm(){
        return alarmFlag;
    }

    public void setAlarmFlag(boolean alarmFlag){
        this.alarmFlag = alarmFlag;
    }

}
