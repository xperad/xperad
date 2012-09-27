package com.xperad.aop;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/09/28
 * Time: 0:51
 * To change this template use File | Settings | File Templates.
 */
public class Juggler implements Performer {

    private int beanBags = 3;

    public Juggler() {
    }

    public Juggler(int beanBags) {
        this.beanBags = beanBags;
    }

    @Override
    public void perform() {
        System.out.println("Juggling with " + beanBags + " bean bags.");
    }
}
