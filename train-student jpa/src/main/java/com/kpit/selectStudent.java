package com.kpit;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class selectStudent {
    public static void main(String args[])
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
        // Scanner sc = new Scanner(System.in);
        // System.out.println("enter the id you want to search");
        // int id= sc.nextInt();
        // Student s1= em.find(Student.class,id);
        // System.out.println("the record you are searching for "+s1.getSid());
        // System.out.println(" the id is "+s1.getSid());
        // System.out.println(" the name  is "+s1.getSname());
        // System.out.println(" the branch  is "+s1.getSbranch());
        // System.out.println(" the grade  is "+s1.getSgrade());
        // System.out.println(" the address is "+s1.getSaddress());
        TypedQuery<Student> tq =em.createQuery("from Student",Student.class);
        List<Student> l = tq.getResultList();
        for(Student s:l)
        {
             System.out.println(" the id is "+s.getSid());
             System.out.println(" the name  is "+s.getSname());
             System.out.println(" the branch  is "+s.getSbranch());
            System.out.println(" the grade  is "+s.getSgrade());
             System.out.println(" the address is "+s.getSaddress());
             System.out.println("....................");
        }
        tr.commit();
    }
    
}