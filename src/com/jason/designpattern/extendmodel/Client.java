package com.jason.designpattern.extendmodel;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Client {
    public static void main(String[] args){
        HummerModel hummerH1Model = new HummerH1Model();
        HummerModel hummerH2Model = new HummerH2Model();
        hummerH1Model.setAlarmFlag(false);
        hummerH1Model.run();
        System.out.println("---------------------------------");
        hummerH2Model.run();
        System.out.println("---------------------------------");
        hummerH1Model.setAlarmFlag(true);
        hummerH1Model.run();
    }
}
