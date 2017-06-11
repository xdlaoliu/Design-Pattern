package com.jason.designpattern.model;

/**
 * Created by Administrator on 2017/6/11.
 */
public abstract class HummerModel {
    public abstract void start();
    public abstract void stop();
    public abstract void alarm();
    public abstract void engineBoom();
    public void run(){
        this.start();
        this.alarm();
        this.engineBoom();
        this.stop();
    }
}
