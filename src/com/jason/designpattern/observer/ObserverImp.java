package com.jason.designpattern.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Administrator on 2017/6/14.
 */
public class ObserverImp implements Observer {

    public void update(Observable o, Object arg) {
        System.out.println(o.toString());
        System.out.println(arg.toString());
    }
}
