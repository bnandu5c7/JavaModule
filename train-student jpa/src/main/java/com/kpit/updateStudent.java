package com.kpit;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updateStudent {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tr = em.getTransaction();
        tr.begin();
         Scanner sc = new  Scanner(System.in);
         System.out.println("enter the id of the student where you want update");
         int rollno = sc.nextInt();
         Student s1 = em.find(Student.class,rollno);
         System.out.println(" the id you entered is "+s1.getSid());
         Scanner sc2= new Scanner(System.in);
         System.out.println(" enter the name you want to update");
         String name = sc2.nextLine();
         s1.setSname(name);
         Scanner sc3= new Scanner(System.in);
         System.out.println(" enter the  address you want to update");
         String gr = sc3.nextLine();
         s1.setSaddress(gr);
         em.merge(s1);
         tr.commit();
         em.close();
    }
    
}
