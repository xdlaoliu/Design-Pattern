package com.jason.designpattern.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private CarBuilder benzBuilder = new BenzBuilder();
    private CarBuilder bMWBuilder = new BMWBuilder();

    public BenzModel getBenzModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        BenzModel benzModel = (BenzModel) this.benzBuilder.getCarModel();
        return benzModel;
    }

    public BMWModel getBMWModel(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("alarm");
        this.sequence.add("stop");
        this.bMWBuilder.setSequence(sequence);
        BMWModel bmwModel = (BMWModel) this.bMWBuilder.getCarModel();
        return bmwModel;
    }

}
