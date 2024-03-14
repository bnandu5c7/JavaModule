package com.kpit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CakeApp {
    public static void main(String args[])
    {
        ApplicationContext c = new ClassPathXmlApplicationContext("MySpringCake.xml");
        CakeController cc = (CakeController) c.getBean(CakeController.class);
        cc.takeOrder();
    }
}
