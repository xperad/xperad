package com.xperad.run;

import com.xperad.aop.Thinker;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/09/28
 * Time: 3:00
 * To change this template use File | Settings | File Templates.
 */
public class App02 {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/aop-2.xml");

        Thinker volunteer = (Thinker) applicationContext.getBean("volunteer");
        volunteer.thinkOfSomething("I'm the best man.");
    }
}
