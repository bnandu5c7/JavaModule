package com.kpit;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
//import javax.persistence.metamodel.Type.PersistenceType;
import javax.persistence.TypedQuery;

/**
 * Hello world!
 *
 */
public class select
{
    public static void main( String[] args )
    {
        System.out.println( "welcome to selection  operation in jpa concept" );
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction et = em.getTransaction();
        et.begin();
    //      Scanner sc = new Scanner(System.in);
    //  System.out.println("enter the id of the record you want to search");
    //      int id = sc.nextInt();                                             //to search for specific record from table
    //      Train t2= em.find(Train.class,id);
        //  System.out.println("the id is "+t2.gettId());
        //  System.out.println("the name is "+t2.gettName());
        //  System.out.println("the source is "+t2.gettSource());
        //  System.out.println("the destination is "+t2.gettDest());
        TypedQuery<Train> typedq = em.createQuery("from Train",Train.class);
        List<Train> tlist = typedq.getResultList();
        for(Train t:tlist )
        {                                                                      // to obtain multiple records
            System.out.println("the id is "+t.gettId());
            System.out.println("the name is "+t.gettName());
            System.out.println("the source is "+t.gettSource());
            System.out.println("the destination is "+t.gettDest());

        }

        et.commit();
        em.close();

    }
}
