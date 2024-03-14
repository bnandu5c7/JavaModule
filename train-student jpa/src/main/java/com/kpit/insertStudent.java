package com.kpit;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertStudent {
    public static void main (String args[])
    {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("Myjpa");
    EntityManager em = emf.createEntityManager();
    EntityTransaction t = em.getTransaction();
      t.begin();
      Student s = new Student(102,"harsha","EEE",'A',"karimnagar");
      Student s1 = new Student(103,"jyothi","ECE",'A',"warangal");
      Student s2 = new Student(104,"keshav","Mechanical",'B',"Sr Nagar");
      Student s3 = new Student(105,"rohan","civil",'A',"Hi-Tech");
      Student  s4= new Student(106,"anvika","degree",'A',"madhapur");
    //   s.setSid(101);
    //   s.setSname("nandu");
    //   s.setSbranch("CSE");
    //   s.setSgrade('A');
    //   s.setSaddress("Hyderabad");
    //   em.persist(s);
    //   t.commit();
    em.persist(s);
    em.persist(s1);
    em.persist(s2);
    em.persist(s3);
    em.persist(s4);
    t.commit();

    }

}
