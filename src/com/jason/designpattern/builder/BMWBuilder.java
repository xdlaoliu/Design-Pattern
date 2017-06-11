package com.jason.designpattern.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/11.
 */
public class BMWBuilder extends CarBuilder {

    private BMWModel bmwModel = new BMWModel();

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.bmwModel.sequence = sequence;
    }

    @Override
    public CarModel getCarModel() {
        return bmwModel;
    }
}
