package com.jason.designpattern.builder;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Main {

    public static void main(String[] args){
        Director director = new Director();
        BenzModel benzModel = director.getBenzModel();
        benzModel.run();
        BMWModel bmwModel = director.getBMWModel();
        bmwModel.run();
    }

}
