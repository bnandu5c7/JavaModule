package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class HostelInsert {
    public static void main(String args[])
    {   
        System.out.println("insertion operation in jpa");
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction t = em.getTransaction();
        t.begin();
         Hostel h = new Hostel(2,"mahalaxmi","phase-3",6500);
         Hostel h1 = new Hostel(3,"sri balaji","phase-2",7500);
         Hostel h2= new Hostel(4,"sri venkateshwara","pune",7000);
         Hostel h3 = new Hostel(5,"srinidhi","phase-2",8500);
        //  h.setHid(1);
        //  h.setHname("devi pg hostel");
        //  h.setHplace("hinjewadi");
        //  h.setHrent(9000);
         em.persist(h);
         em.persist(h1);
         em.persist(h2);
         em.persist(h3);
        t.commit();


    }
}
