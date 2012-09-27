package com.xperad.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 12/09/27
 * Time: 23:42
 * To change this template use File | Settings | File Templates.
 */
public class Audience {

    public void takeSeats() { // Before the Concert
        System.out.println("The audience is taking their seats.");
    }

    public void turnOffCellPhones() { // Before the Concert
        System.out.println("The audience is turning off their cellphones.");
    }

    public void applaud() { // After the Concert
        System.out.println("CLAP CLAP CLAP CLAP CLAP CLAP");
    }

    public void demandRefund() { // Fail the Concert
        System.out.println("Boo! We want our money back!");
    }

    public void watchPerformance(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("The audience is taking their seats.");
            System.out.println("The audience is turning off their cellphones");
            long start = System.currentTimeMillis(); // 공연 전

            joinPoint.proceed(); // 어드바이스 대상 메소드 진행

            long end = System.currentTimeMillis(); // 공연 후
            System.out.println("CLAP CLAP CLAP CLAP CLAP");
            System.out.println("The performance took " + (end - start) + " milliseconds.");

        } catch (Throwable t) {
            System.out.println("Boo! We want our money back!"); // 공연 실패 후
        }
    }
}
