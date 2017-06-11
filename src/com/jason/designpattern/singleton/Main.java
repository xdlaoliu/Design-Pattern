package com.jason.designpattern.singleton;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Main {

    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1);
        System.out.println(singleton1);
        System.out.println(singleton1==singleton2);
    }

}
