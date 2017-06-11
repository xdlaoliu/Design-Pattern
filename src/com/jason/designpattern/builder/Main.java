package com.jason.designpattern.builder;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Main {

    public static void main(String[] args){
        Director director = new Director();
        BenzModel benzModel = director.getBenzModel();
        BMWModel bmwModel = director.getBMWModel();
        benzModel.run();
        bmwModel.run();
    }

}
