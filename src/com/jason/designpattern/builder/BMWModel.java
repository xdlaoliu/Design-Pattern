package com.jason.designpattern.builder;

/**
 * Created by Administrator on 2017/6/11.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("BMW start ...");
    }

    @Override
    protected void stop() {
        System.out.println("BMW stop ...");
    }

    @Override
    protected void alarm() {
        System.out.println("BMW alarm ...");
    }

    @Override
    protected void engineboom() {
        System.out.println("BMW engineboom ...");
    }
}
