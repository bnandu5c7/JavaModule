package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteTrain {

public static void main(String args[])
{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
    EntityManager em = emf.createEntityManager();
    EntityTransaction et = em.getTransaction();
    et.begin();
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the id through which you want delete the record");
     int tid = sc.nextInt();
     Train t1 = em.find(Train.class,tid);
     System.out.println("the id you entered is "+t1.gettId());
     Scanner sc1 = new Scanner(System.in);
     System.out.println("enter the confirmation for deletion of recoed");
     String ans = sc1.nextLine();
     if(ans.equalsIgnoreCase("y")|| ans.equalsIgnoreCase("yes"))
     {
        em.remove(t1);
        et.commit();
     }
     em.close();
}
    
}
