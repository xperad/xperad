package com.xperad.aop;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/09/28
 * Time: 1:17
 * To change this template use File | Settings | File Templates.
 */
public class Magician implements MindReader {

    private String thoughts;

    @Override
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts.");
        this.thoughts = thoughts;
    }

    @Override
    public String getThoughts() {
        return thoughts;
    }
}
