package com.jason.designpattern.builder;

/**
 * Created by Administrator on 2017/6/11.
 */
public class BenzModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("Benz start ...");
    }

    @Override
    protected void stop() {
        System.out.println("Benz stop ...");
    }

    @Override
    protected void alarm() {
        System.out.println("Benz alarm ...");
    }

    @Override
    protected void engineboom() {
        System.out.println("Benz engineboom ...");
    }

}
