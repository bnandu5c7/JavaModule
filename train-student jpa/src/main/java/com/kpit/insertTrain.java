package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.persistence.metamodel.Type.PersistenceType;

/**
 * Hello world!
 *
 */
public class insertTrain 
{
    public static void main( String[] args )
    {
        System.out.println( "welcome to insertion operation in jpa concept" );
        EntityManagerFactory ef=Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em= ef.createEntityManager();
        EntityTransaction et=em.getTransaction();
        et.begin();
        Train t = new Train(102,"narayanadhri","hyd","tirupathi","10-23-45");
        Train t1= new Train(103,"godavari","hyd","tirupathi","10-23-45");
        Train t2 =new Train(104,"venkatadhri","pune","mumbai","11-23-45");
         em.persist(t);
         em.persist(t1);
         em.persist(t2);
         et.commit();
}
}

