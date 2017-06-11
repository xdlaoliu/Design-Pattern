package com.jason.designpattern.builder;

import java.util.*;

/**
 * Created by Administrator on 2017/6/11.
 */
public abstract class CarModel {

    protected ArrayList<String> sequence = new ArrayList<String>();

    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineboom();

    final public void run(){
        Iterator<String> iterator = sequence.iterator();
        String item = null;
        while(iterator.hasNext()){
            item = iterator.next();
            if("start".equalsIgnoreCase(item)){
                this.start();
            } else if("stop".equalsIgnoreCase(item)){
                this.stop();
            } else if("alarm".equalsIgnoreCase(item)){
                this.alarm();
            } else if("engineboom".equalsIgnoreCase(item)){
                this.engineboom();
            }
        }
    }

    final public void setSequence(ArrayList<String> sequence){
        this.sequence = sequence;
    }

}
