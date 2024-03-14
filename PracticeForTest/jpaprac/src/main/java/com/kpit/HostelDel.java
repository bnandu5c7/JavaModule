package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HostelDel {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction e = em.getTransaction();
        e.begin();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the id you want to delete");
        int id = sc.nextInt();
        Hostel h = em.find(Hostel.class,id);
        Scanner s= new Scanner(System.in);
        String  res = s.nextLine();
        if(res.equalsIgnoreCase("yes")||res.equalsIgnoreCase("y"))
        {
            em.remove(h);
            em.close();
            e.commit();
        }

    }
    
}
