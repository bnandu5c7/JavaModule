package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Select {
    public static void main(String args[])
    {
        System.out.println("example of select operation in jpa");
            EntityManagerFactory fact=Persistence.createEntityManagerFactory("MyJPA");
            EntityManager em = fact.createEntityManager();
            System.out.println("enter the id of the flight to be searched");
            Scanner sc = new Scanner(System.in);
            int flightNumber = sc.nextInt();
            Flight f = em.find(Flight.class,flightNumber);
            if(f==null)
            {
                throw new FlightNumberNotFoundException("ohhh the flight number you are searching is not avaiable currently");
            }
            System.out.println("the flight number is "+f.getFlightNo());
            System.out.println("the flight name  is "+f.getFlightName());
            System.out.println("the  source place  is "+f.getSource());
            System.out.println("the destination place is "+f.getDestination());
    }
    
}
