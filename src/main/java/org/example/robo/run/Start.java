package org.example.robo.main;

import org.example.robo.impl.bot.ModelT1000;
import org.example.robo.impl.bot.ModelT2000;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {

    public static void main(String[] args) throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println("===");
        Object robotObj1 = context.getBean("t1000");
        if (robotObj1 instanceof ModelT1000 robotT1000) {
            robotT1000.dance();
            robotT1000.action();
        }
        System.out.println("===");
        Object robotObj2 = context.getBean("t2000v1");
        if (robotObj2 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }
        System.out.println("===");
        Object robotObj3 = context.getBean("t2000v2");
        if (robotObj3 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }
        System.out.println("===");
        Object robotObj4 = context.getBean("t2000v2");
        if (robotObj4 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }
        System.out.println("===");
        Object robotObj5 = context.getBean("t2000v3");
        if (robotObj5 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }
        System.out.println("===");
        Object robotObj6 = context.getBean("t2000v3");
        if (robotObj6 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }
        System.out.println("===");
        Object robotObj7 = context.getBean("t2000v4");
        if (robotObj7 instanceof ModelT2000 robotT2000) {
            robotT2000.dance();
            robotT2000.action();
        }
        System.out.println("===");
    }
}
