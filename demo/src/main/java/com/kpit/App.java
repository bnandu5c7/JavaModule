package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String args[] )
    {
    
        System.out.println( "Hello World!" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MyJPA");
        EntityManager em = emf.createEntityManager();
        EntityTransaction trans = em.getTransaction();
        trans.begin();
           Flight obj = new Flight(14,"airo","hyd","mumbai");
           Flight obj1 = new Flight(13,"airo1","hyd","mumbai");
           Flight obj2 = new Flight(16,"airo2","hyd","mumbai");
           Flight obj3 = new Flight(11,"airo3","hyd","mumbai");  
           em.persist(obj);
           em.persist(obj1);
           em.persist(obj2);
           em.persist(obj3);

        trans.commit();

    }
}
