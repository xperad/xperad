package com.xperad.aop;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/09/28
 * Time: 1:50
 * To change this template use File | Settings | File Templates.
 */
public class Volunteer implements Thinker {

    private String thoughts;

    @Override
    public void thinkOfSomething(String thoughts) {
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
