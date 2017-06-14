package com.jason.designpattern.proxy;

/**
 * Created by Administrator on 2017/6/13.
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer){
        this.gamePlayer = gamePlayer;
    }

    public void login(String user, String password) {
        System.out.println("Proxy start ...");
        System.out.println("User name is "+user+" password is "+password);
        System.out.println("Proxy end ...");
    }

    public void killBoss() {
        System.out.println("Proxy start ...");
        System.out.println("Kill Boss");
        System.out.println("Proxy end ...");
    }

    public void upgrade() {
        System.out.println("Proxy start ...");
        System.out.println("Kill Boss");
        System.out.println("Proxy end ...");
    }
}
