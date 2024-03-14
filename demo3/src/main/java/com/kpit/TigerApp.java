package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TigerApp {
    public static  void main(String args[])
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("MySpringAnno.xml");
        Tiger obj = (Tiger)c.getBean("myTiger");
        BengalTiger obj1= (BengalTiger)c.getBean("myBengalTiger");
        Bear b =(Bear)c.getBean(Bear.class);
    }
}
    
