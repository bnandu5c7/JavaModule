package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
         Scanner sc = new Scanner(System.in);
         System.out.println("enter the record id you want to dlt");
         int id = sc.nextInt();
         Student s = em.find(Student.class,id);
         System.out.println(" the id is"+s.getSid());
         Scanner sc2 = new Scanner(System.in);
         String res = sc2.nextLine();
         if(res.equalsIgnoreCase("y")|| res.equalsIgnoreCase("yes"))
         {
              em.remove(s);
              trans.commit();
              em.close();
         }
        
    }
    
}
