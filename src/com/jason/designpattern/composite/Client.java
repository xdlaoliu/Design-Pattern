package com.jason.designpattern.composite;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Client {

    public static void main(String[] args) {
        Composite root = new Composite();
        root.doSomething();
        Composite branch = new Composite();
        Leaf leaf = new Leaf();
        root.add(branch);
        branch.add(leaf);
        display(root);
    }

    public static void display(Composite root){
        for(Component component:root.getChildren()){
            if(component instanceof Leaf){
                component.doSomething();
            }else{
                display((Composite) component);
            }
        }
    }

}
