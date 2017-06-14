package com.jason.designpattern.mediator;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Purchase extends Colleague {


    public Purchase(Mediator mediator) {
        super(mediator);
    }

    public void buyIBMcomputer(int number){
        super.mediator.execute("purchase.buy", number);
    }

    public void refuseBuyIBM(){
        System.out.println("Refuse IBM");
    }

}
