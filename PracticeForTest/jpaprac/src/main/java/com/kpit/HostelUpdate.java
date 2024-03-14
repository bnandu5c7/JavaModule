package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HostelUpdate {
    public static void main(String[] args) {
        EntityManagerFactory fact = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = fact.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the id where you want to update");
         int id = sc.nextInt();
         Hostel obj = em.find(Hostel.class,id);
         Scanner sc2 = new Scanner(System.in);
         System.out.println("enter the  new name of hostel");
         String name = sc2.nextLine();
         obj.setHname(name);
          Scanner sc1 = new Scanner(System.in);
         System.out.println("enter the  new place  of hostel");
         String place = sc1.nextLine();
         obj.setHplace(place);
         em.merge(obj);
         em.close();
         tr.commit();


        
    }
    
}
