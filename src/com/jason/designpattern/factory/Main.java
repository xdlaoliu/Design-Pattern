package com.jason.designpattern.factory;

import javax.xml.parsers.FactoryConfigurationError;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Main {

    public static void main(String[] args){
        AbstractHumanFactory humanFactory = new HumanFactory();
        Human yellowHuman = humanFactory.createHuman(YellowHuman.class);
        yellowHuman.task();
        yellowHuman.getColor();
    }

}
