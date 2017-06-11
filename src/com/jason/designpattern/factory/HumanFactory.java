package com.jason.designpattern.factory;

/**
 * Created by Administrator on 2017/6/11.
 */
public class HumanFactory extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c){
        Human human = null;
        try {
            human = (Human) Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) human;
    }
}
