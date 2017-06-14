package com.jason.designpattern.proxy;

/**
 * Created by Administrator on 2017/6/13.
 */
public class GamePlayer implements IGamePlayer {

    public void login(String user, String password) {
        System.out.println("Username is "+user+" password is "+password);
    }

    public void killBoss() {
        System.out.println("Kill one boss");
    }

    public void upgrade() {
        System.out.println("Upgrade");
    }

}
