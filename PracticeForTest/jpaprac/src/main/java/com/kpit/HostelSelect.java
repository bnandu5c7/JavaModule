package com.kpit;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class HostelSelect {
    public static void main(String[] args) {
        System.out.println("select operation of jpa");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the id you want to display");
        // int id = sc.nextInt();
        // Hostel h = em.find(Hostel.class,id);
        // System.out.println("the id of hostel is"+h.getHid());
        // System.out.println("the name of hostel is"+h.getHname());
        // System.out.println("the palce of hostel is"+h.getHplace());
        // System.out.println("the cost  of hostel is"+h.getHrent());
        TypedQuery<Hostel> tq = em.createQuery("From Hostel",Hostel.class);
        List<Hostel> l =tq.getResultList();
        for(Hostel h:l)
        {
            System.out.println("the id of hostel is  "+h.getHid());
            System.out.println("the name of hostel is  "+h.getHname());
            System.out.println("the palce of hostel is  "+h.getHplace());
            System.out.println("the cost  of hostel is  "+h.getHrent());
            System.out.println("..............");

        }
        t.commit();
    }
}
