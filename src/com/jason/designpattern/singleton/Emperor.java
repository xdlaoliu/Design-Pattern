package com.jason.designpattern.singleton;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Administrator on 2017/6/11.
 */
public class Emperor {

    private static int maxNumOfEmperor = 5;
    private static ArrayList<Emperor> emperorList = new ArrayList<Emperor>();
    private String name;

    private static int countNumOfEmperor = 0;

    static{
        for(int i=0;i<maxNumOfEmperor;i++){
            emperorList.add(new Emperor("Emperor "+(i+1)));
        }
    }

    private Emperor(){

    }

    private Emperor(String name){
        this.name = name;
    }

    public static Emperor getInstance(){
        Random random = new Random();
        countNumOfEmperor = random.nextInt(maxNumOfEmperor);
        return emperorList.get(countNumOfEmperor);
    }

}
