package com.jason.designpattern.proxy;

/**
 * Created by Administrator on 2017/6/13.
 */
public class Main {

    public static void main(String[] args){
        IGamePlayer player = new GamePlayer();
        IGamePlayer proxy = new GamePlayerProxy(player);
        proxy.login("Jason", "123456");
        proxy.killBoss();
        proxy.upgrade();

        GamePlayerIH gamePlayerIH = new GamePlayerIH();
        IGamePlayer gamePlayerProxy = (IGamePlayer) gamePlayerIH.bind(new GamePlayer());
        gamePlayerProxy.killBoss();
    }

}
