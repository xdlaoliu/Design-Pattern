package com.jason.designpattern.singleton;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Singleton {

    private static final Singleton singleton = new Singleton();

    private Singleton(){

    }

    public static Singleton getInstance(){
        return singleton;
    }

}
