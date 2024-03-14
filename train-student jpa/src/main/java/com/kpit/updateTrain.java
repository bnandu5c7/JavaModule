package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateTrain {
    public static void main(String args[])
    {
        System.out.println("it is an example of update operation");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the id where u want update the date :");
        int tNumber =sc.nextInt();
        Train t1 = em.find(Train.class,tNumber);
        Scanner sc1= new Scanner(System.in);
        System.out.println("enter the date  :");
        String  tDate =sc1.nextLine();
        t1.settArraival(tDate);
        em.merge(t1);
        tr.commit();
        em.close();     
        
    }
    
}
