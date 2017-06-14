package com.jason.designpattern.mediator;

/**
 * Created by Administrator on 2017/6/14.
 */
public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

}
