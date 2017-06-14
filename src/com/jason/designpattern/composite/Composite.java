package com.jason.designpattern.composite;

import com.jason.designpattern.mediator.Colleague;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Composite extends Component {

    private ArrayList<Component> componentArrayList = new ArrayList<Component>();

    public void add(Component component){

        this.componentArrayList.add(component);

    }

    public void remove(Component component){

        this.componentArrayList.remove(component);

    }

    public ArrayList<Component> getChildren(){

        return this.componentArrayList;

    }

}
