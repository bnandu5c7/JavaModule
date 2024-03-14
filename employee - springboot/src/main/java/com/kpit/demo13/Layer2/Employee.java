package com.kpit.demo13.Layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
    @Id
    @Column(name="eid")
    private int eid;
    @Column(name="ename")
    private String ename;
    @Column(name="esalary")
    private float esalary;
    public Employee() {
    }
    public Employee(int eid, String ename, float esalary) {
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getEname() {
        return ename;
    }
    public void setEname(String ename) {
        this.ename = ename;
    }
    public float getEsalary() {
        return esalary;
    }
    public void setEsalary(float esalary) {
        this.esalary = esalary;
    }




    
}
