package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {
    @Id
    @Column(name="Sid")
    private int Sid;
    @Column(name="Sname")
    private String Sname;
    @Column(name="Sbranch")
    private String Sbranch;
    @Column(name="Sgrade")
    private char Sgrade;
    @Column(name="Saddress")
    private String Saddress;
    public Student() {
    }
    
    public Student(int sid, String sname, String sbranch, char sgrade, String saddress) {
        Sid = sid;
        Sname = sname;
        Sbranch = sbranch;
        Sgrade = sgrade;
        Saddress = saddress;
    }

    public int getSid() {
        return Sid;
    }
    public void setSid(int sid) {
        Sid = sid;
    }
    public String getSname() {
        return Sname;
    }
    public void setSname(String sname) {
        Sname = sname;
    }
    public String getSbranch() {
        return Sbranch;
    }
    public void setSbranch(String sbranch) {
        Sbranch = sbranch;
    }
    public char getSgrade() {
        return Sgrade;
    }
    public void setSgrade(char sgrade) {
        Sgrade = sgrade;
    }
    public String getSaddress() {
        return Saddress;
    }
    public void setSaddress(String  saddress) {
        Saddress = saddress;
    }


    
}
