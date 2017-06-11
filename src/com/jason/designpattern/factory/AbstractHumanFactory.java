package com.jason.designpattern.factory;

/**
 * Created by Administrator on 2017/6/11.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}
