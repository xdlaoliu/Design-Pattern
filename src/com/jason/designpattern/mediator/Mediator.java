package com.jason.designpattern.mediator;

/**
 * Created by Administrator on 2017/6/14.
 */
public abstract class Mediator {

    protected Purchase purchase;
    protected Sale sale;
    protected Stock stock;

    public Purchase getPurchase() {
        return purchase;
    }

    public void setPurchase(Purchase purchase) {
        this.purchase = purchase;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Stock getStock() {
        return stock;
    }

    public void setStock(Stock stock) {
        this.stock = stock;
    }

    public abstract void execute(String str,Object ... objects);

}
