package com.jason.designpattern.visitor;

/**
 * Created by Administrator on 2017/6/14.
 */
public abstract class Element {

    public abstract void doSomething();
    public abstract void accept(IVistor visitor);

}
