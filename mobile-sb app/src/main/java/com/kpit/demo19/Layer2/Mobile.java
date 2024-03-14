package com.kpit.demo19.Layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Mobile")
public class Mobile {
    @Id
    @Column(name="mid")
    private int mid;
    @Column(name="mname")
    private String mname;
    @Column(name="mcost")
    private int mcost;
    public Mobile() {
    }
    public Mobile(int mid, String mname, int mcost) {
        this.mid = mid;
        this.mname = mname;
        this.mcost = mcost;
    }
    public int getMid() {
        return mid;
    }
    public void setMid(int mid) {
        this.mid = mid;
    }
    public String getMname() {
        return mname;
    }
    public void setMname(String mname) {
        this.mname = mname;
    }
    public int getMcost() {
        return mcost;
    }
    public void setMcost(int mcost) {
        this.mcost = mcost;
    }   
}
