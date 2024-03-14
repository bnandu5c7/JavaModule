package com.kpit;

public class App1 {
    public static void main(String args[])
    {
        College obj = new College("mrcew","hyd");
        HeadMaster hm = new HeadMaster("sharma","eee",obj);
        Teacher t = new Teacher("chitra","social",'F' ,45000,hm);
        Student s =new Student("nandini","8th class",t);
        s.attendance("nandu");
    }
    
}
class College{
    String collegeName;
    String place;
    public College(String collegeName, String place) {
        this.collegeName = collegeName;
        this.place = place;
        System.out.println(collegeName+ " is located in area called "+place);
    }
    void location(String place)
    {
        this.place=place;
        System.out.println("college is present in "+place);
    }
    

}
class HeadMaster{
    String hName;
    String department;
    College college;
    public HeadMaster(String hName, String department, College college) {
        this.hName = hName;
        this.department = department;
        this.college = college;
        System.out.println(hName+" is leading the department "+department);
    }
    void leading(String hName,String department)
    { 
        this.hName=hName;
        this.department=department;
        System.out.println(hName+" is leading "+department);
        college.location("hyderabad");

    }
    

}
class Teacher
{
    String tName;
    String subject;
    char gender;
    double salary;
    HeadMaster head;
    public Teacher(String tName, String subject, char gender, double salary,HeadMaster head) {
        this.tName = tName;
        this.subject = subject;
        this.gender = gender;
        this.salary = salary;
        this.head=head;
        System.out.println(tName+" is teaching "+subject+" and salary is"+salary);
    }
    void teaching(String tName,String subject)
    {
        this.tName = tName;
        this.subject= subject;
        System.out.println(tName+" is teaching "+subject);
        head.leading("shankar","cse");
    }
    
}
class Student
{
    String sname;
    String standard;
    Teacher teacher;
    public Student(String sname, String standard,Teacher teacher) {
        this.sname = sname;
        this.standard=standard;
        this.teacher = teacher;
        System.out.println(sname+"is studying in"+standard);
    }
    void attendance(String name1)
    { 
        sname =name1;
        System.out.println(name1+"is present");
        teacher.teaching("sharma","maths");
    }


}
