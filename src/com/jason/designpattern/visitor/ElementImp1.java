package com.jason.designpattern.visitor;

/**
 * Created by Administrator on 2017/6/14.
 */
public class ElementImp1 extends Element {
    @Override
    public void doSomething() {
        System.out.println("Element do something.");
    }

    @Override
    public void accept(IVistor visitor) {
        visitor.visit(this);
    }
}
