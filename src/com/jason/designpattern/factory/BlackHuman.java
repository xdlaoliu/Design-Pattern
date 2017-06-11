package com.jason.designpattern.factory;

import com.sun.javafx.scene.traversal.Hueristic2D;

/**
 * Created by Administrator on 2017/6/11.
 */
public class BlackHuman implements Human {
    @Override
    public void task() {
        System.out.println("This is Black Human.");
    }

    @Override
    public void getColor(){
        System.out.println("My color is black.");
    }
}
