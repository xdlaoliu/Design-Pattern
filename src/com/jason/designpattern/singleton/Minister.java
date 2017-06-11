package com.jason.designpattern.singleton;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Minister {

    public static void main(String[] args){
        Emperor emperor1 = Emperor.getInstance();
        Emperor emperor2 = Emperor.getInstance();
        Emperor emperor3 = Emperor.getInstance();

        System.out.println(emperor1);
        System.out.println(emperor2);
        System.out.println(emperor3);
    }

}
