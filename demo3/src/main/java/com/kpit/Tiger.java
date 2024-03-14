package com.kpit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
//import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("myTiger")
@Scope("prototype")//
public class Tiger {
    String name;
    @Autowired
    Tiger(@Value("jack")String name)
    { this.name = name;
        System.out.println("Tiger() created......."+name);
    }
    
}
@Component("myBengalTiger")//id of that tiger class
@Scope("prototype")
class BengalTiger extends Tiger{
    @Autowired
    BengalTiger(@Value("john")String name)
    {
        super(name);
      System.out.println("bengal tiger class is created"+name);
    }
}
@Component
@Scope("prototype")
class Bear{
    String name1;
    String color;
    @Autowired
    Bear(@Value("jessy")String name1,@Value("REd")String color)//argument level annotation
    { 
        this.name1 =name1;
        this.color=color;
        System.out.println("bear name is "+name1+"  and its colour is "+color);
    }

}
