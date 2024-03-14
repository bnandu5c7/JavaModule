package com.kpit;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Component
public class Cake{
    public Cake()
    {
        System.out.println("Cake component");
    }
    void cakeType()
    {
        System.out.println("black Current cake is orderd");
    }



}
@Repository
class CakeRepository
{
    Cake c;
    public CakeRepository()
    {
        System.out.println("Cake repository");
    }
    void prepareCake()
    {
        System.out.println("preparing  cake for service");
        c.cakeType();
    }
}
@Service
class CakeService
{
    CakeRepository cr;
    public CakeService()
    {
        System.out.println("CakeController()");
    }
    void provideCake()
    {
        System.out.println("provide the cake service");
        cr.prepareCake();
    }
}
@Controller
class CakeController
{ 
    CakeService cs;
    public CakeController()
    {
        System.out.println("CakeController()");
    }
    void takeOrder()
    {
        System.out.println("taking the order of cake");
         cs.provideCake();
    }

}
