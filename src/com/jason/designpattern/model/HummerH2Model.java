package com.jason.designpattern.model;

/**
 * Created by Administrator on 2017/6/11.
 */
public class HummerH2Model extends HummerModel {
    @Override
    public void start() {
        System.out.println("H2 starts ...");
    }

    @Override
    public void stop() {
        System.out.println("H2 stops ...");
    }

    @Override
    public void alarm() {
        System.out.println("H2 alarms ...");
    }

    @Override
    public void engineBoom() {
        //do nothing
    }
}
