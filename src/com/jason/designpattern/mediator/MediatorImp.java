package com.jason.designpattern.mediator;

/**
 * Created by Administrator on 2017/6/14.
 */
public class MediatorImp extends Mediator{

    @Override
    public void execute(String str, Object... objects) {
        if("purchase.buy".equals(str)){
            this.buyComputer((Integer)objects[0]);
        }else if("sale.sell".equals(str)){
            this.sellComputer((Integer)objects[0]);
        }else if("sale.offsell".equals(str)){
            this.offSell();
        }else if("sale.clear".equals(str)){
            this.clearStock();
        }
    }

    private void buyComputer(int number){
        int saleStatus = super.sale.getStatus();
        if(saleStatus>80){
            System.out.println("Buy Computer "+number);
        }else{
            System.out.println("Buy Computer "+number/2);
        }
    }

    private void sellComputer(int number){
        if(super.stock.getStockNumber()<number){
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);
    }

    private void offSell(){
        System.out.println("Discount sale IBM computers "+stock.getStockNumber());
    }

    private void clearStock(){
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

}
