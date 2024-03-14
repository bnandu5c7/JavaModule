package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LotusApp {
    public static void main(String args[])
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("MySpring.xml");
        Lotus  l = (Lotus)context.getBean("MyLotus");
        l.bloom();
        System.out.println(".....................");
        Lotus l1 =(Lotus)context.getBean("MyLotus1");
        l1.bloom();
        System.out.println(".....................");
        Lotus l2=(Lotus)context.getBean("MyLotus2");
        l2.bloom();
        System.out.println(".....................");
        Lotus l3 =(Lotus)context.getBean("MyLotus3");
        l3.bloom();
        Student s =(Student)context.getBean("MyStudent");
        s.attendance("nandu");
    }
    
}
