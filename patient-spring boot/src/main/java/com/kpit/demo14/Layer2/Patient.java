package com.kpit.demo14.Layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Patient")
public class Patient {
    @Id
    @Column(name="pid")
    private int pid;
    @Column(name="pname")
    private String pname;
    @Column(name="page")
    private int page;
    @Column(name="ptreat")
    private String ptreat;
    @Column(name="pbill")
    private double pbill;
    public Patient() {
    }
    public Patient(int pid, String pname, int page, String ptreat, double pbill) {
        this.pid = pid;
        this.pname = pname;
        this.page = page;
        this.ptreat = ptreat;
        this.pbill = pbill;
    }
    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public int getPage() {
        return page;
    }
    public void setPage(int page) {
        this.page = page;
    }
    public String getPtreat() {
        return ptreat;
    }
    public void setPtreat(String ptreat) {
        this.ptreat = ptreat;
    }
    public double getPbill() {
        return pbill;
    }
    public void setPbill(double pbill) {
        this.pbill = pbill;
    }   
}
