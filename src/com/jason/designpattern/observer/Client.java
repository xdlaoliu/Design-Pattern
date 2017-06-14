package com.jason.designpattern.observer;

import java.util.Observer;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Client {

    public static void main(String[] args){
        SubjectImp subject = new SubjectImp();
        Observer observer = new ObserverImp();
        subject.addObserver(observer);
        subject.doSomething();
    }

}
