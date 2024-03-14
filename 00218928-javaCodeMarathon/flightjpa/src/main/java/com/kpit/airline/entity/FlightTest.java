package com.kpit.airline.entity;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class FlightTest {
    public static void main(String[] args) {

        // Scanner scan = new Scanner(System.in);
        // int val = scan.nextInt();
        // switch(val)
        // {
        //     case 1:

        // }
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
         Flight f = new Flight();
         System.out.println("insert single record ");
         f.setFid(1);
         f.setFname("aero");
         f.setFsource("hyderabad");
         f.setFdestination("banglore");
         em.persist(f);
         tr.commit();
       

        
        tr.begin();
        System.out.println("inserting multiple records....");
        Flight f5 = new Flight(2,"swasthika","Mumbai","Hyderabad");
        Flight f1 = new Flight(3,"swesta","pune","mumbai");
        Flight f2 = new Flight(4,"aero2","Us","kerala");
        Flight f3 = new Flight(5,"rohik","hinjewadi","banglore");
        Flight f4 = new Flight(6,"rohiwsh","srilanka","mumbai");
        em.persist(f1);
        em.persist(f2);
        em.persist(f3);
        em.persist(f4);
        em.persist(f5);
        tr.commit();



        tr.begin();
        System.out.println("update operation in jpa.....");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter flight id you want to update  ");
        int number = sc.nextInt();
        Flight fl = em.find(Flight.class,number);
        Scanner sc1= new Scanner(System.in);
        System.out.println("enter the new  name  of  flight   ");
        String name= sc1.nextLine();
        fl.setFname(name);
        em.merge(fl);
        tr.commit();



        tr.begin();
        System.out.println(" delete operation of jpa....");
        Scanner sc4= new Scanner(System.in);
        System.out.println(" enter the flight id  you want to delete");
        int id= sc4.nextInt();
        Flight fobj =em.find(Flight.class,id);
        Scanner sc5= new Scanner(System.in);
        System.out.println("are you really want to delete the record");
        String confirm = sc5.nextLine();
        if(confirm.equalsIgnoreCase("yes")||confirm.equalsIgnoreCase("y"))
        {
            em.remove(fobj);
            System.out.println("deleted successfully....");
           
        }
        tr.commit();



        tr.begin();
         System.out.println("reading single record.....");
         Scanner sc7= new Scanner(System.in);
         System.out.println("enter the id of flight you want to retrive");
         int idobj= sc7.nextInt();
         Flight obj = em.find(Flight.class,idobj);
         System.out.println(" the id of flight :"+obj.getFid());
         System.out.println(" the name  of flight :"+obj.getFname());
         System.out.println(" the  source place  of flight :"+obj.getFsource());
         System.out.println(" the  destination palce of flight :"+obj.getFdestination());
         tr.commit();




        tr.begin();
        System.out.println("reading all records.....");
        TypedQuery<Flight> tq = em.createQuery("from Flight",Flight.class);
        List<Flight> l = tq.getResultList();
        for(Flight obj2 :l)
        {
            System.out.println("the id of flight  : "+obj2.getFid());
            System.out.println("the id of flight  : "+obj2.getFname());
            System.out.println("the id of flight  : "+obj2.getFsource());
            System.out.println("the id of flight  : "+obj2.getFdestination());
            System.out.println("..............");
        }
        tr.commit();



        
    }
    
}
