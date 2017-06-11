package com.jason.designpattern.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/11.
 */
public class BenzBuilder extends CarBuilder{

    private BenzModel benzModel = new BenzModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.benzModel.sequence = sequence;
    }

    @Override
    public CarModel getCarModel() {
        return benzModel;
    }
}
