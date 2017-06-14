package com.jason.designpattern.mediator;

import java.util.Random;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Sale extends Colleague {


    public Sale(Mediator mediator) {
        super(mediator);
    }

    public void sellIBMComputer(int number){
        super.mediator.execute("sale.sell",number);
        System.out.println("Sell computer number " + number);
    }

    public int getStatus(){
        Random random = new Random();
        int salesStatus = random.nextInt(100);
        System.out.println("IBM Sale Status "+salesStatus);
        return salesStatus;
    }

    public void offSale(){
        super.mediator.execute("sales.offsell");
    }

}
