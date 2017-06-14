package com.jason.designpattern.mediator;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Stock extends Colleague {

    public Stock(Mediator mediator) {
        super(mediator);
    }

    public static int COMPUTER_NUMBER = 100;

    public void increase(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("Stock number is "+COMPUTER_NUMBER);
    }

    public void decrease(int number){
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("Stock number is "+COMPUTER_NUMBER);
    }

    public int getStockNumber(){
        return COMPUTER_NUMBER;
    }

    public void clearStock(){
        System.out.println("Clear Stock "+COMPUTER_NUMBER);
        super.mediator.execute("stock.clear");
    }

}
