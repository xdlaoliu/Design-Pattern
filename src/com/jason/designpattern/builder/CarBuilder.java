package com.jason.designpattern.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/11.
 */
public abstract class CarBuilder {

    public abstract void setSequence(ArrayList<String> sequence);
    public abstract CarModel getCarModel();

}
