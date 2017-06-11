package com.jason.designpattern.factory;

/**
 * Created by Administrator on 2017/6/11.
 */
public class YellowHuman implements Human {
    @Override
    public void task() {
        System.out.println("This is a yellow man.");
    }

    @Override
    public void getColor() {
        System.out.println("My color is yellow.");
    }
}
