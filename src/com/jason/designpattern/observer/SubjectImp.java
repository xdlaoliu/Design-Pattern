package com.jason.designpattern.observer;


import java.util.*;
import java.util.Observer;

/**
 * Created by Administrator on 2017/6/14.
 */
public class SubjectImp extends Observable implements Subject {

    public void doSomething(){
        System.out.println("Subject do something");
        super.setChanged();
        super.notifyObservers("Han is eating");
    }

    public void addObserver(Observer observer){

        super.addObserver(observer);

    }

}
