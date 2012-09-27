package com.xperad.run;

import com.xperad.aop.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/09/28
 * Time: 2:54
 * To change this template use File | Settings | File Templates.
 */
public class App01 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/aop-1.xml");

        Performer performer1 = (Performer) applicationContext.getBean("juggler1");
        performer1.perform();
    }
}
