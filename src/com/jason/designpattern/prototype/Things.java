package com.jason.designpattern.prototype;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Things implements Cloneable {

    private ArrayList<String> arrayList = new ArrayList<String>();
    public Things clone(){
        Things things = null;

        try {
            things = (Things) super.clone();
            things.arrayList = (ArrayList<String>) this.arrayList.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return things;
    }

}
