package com.jason.designpattern.model;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Client {
    public static void main(String[] args){
        HummerModel hummerH1Model = new HummerH1Model();
        HummerModel hummerH2Model = new HummerH2Model();

        hummerH1Model.run();
        hummerH2Model.run();
    }
}
