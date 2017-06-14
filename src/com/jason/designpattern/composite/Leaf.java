package com.jason.designpattern.composite;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Leaf extends Component {

    @Override
    public void doSomething() {
        System.out.println("Leaf Do Something");
    }
}
