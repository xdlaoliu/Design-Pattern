package com.jason.designpattern.mediator;

/**
 * Created by Administrator on 2017/6/14.
 */
public class Main {

    public static void main(String[] args){

        Mediator mediator = new MediatorImp();

        Purchase purchase = new Purchase(mediator);
        Sale sale = new Sale(mediator);
        Stock stock = new Stock(mediator);

        mediator.setPurchase(purchase);
        mediator.setSale(sale);
        mediator.setStock(stock);

        purchase.buyIBMcomputer(100);
    }

}
