package com.jason.designpattern.visitor;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Visitor implements IVistor {
    public void visit(ElementImp1 elementImp1) {
        elementImp1.doSomething();
    }

    public void visit(ElementImp2 elementImp2) {
        elementImp2.doSomething();
    }
}
