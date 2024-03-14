package com.kpit.demo20;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Laptop")
public class Laptop {
    @Id
    @Column(name="lid")
    private int lid;
    @Column(name="lname")
    private String lname;
    @Column(name="lprice")
    private int lprice;
    @Column(name="lwarranty")
    private int lwarranty;
    public Laptop() {
    }
    public Laptop(int lid, String lname, int lprice, int lwarranty) {
        this.lid = lid;
        this.lname = lname;
        this.lprice = lprice;
        this.lwarranty = lwarranty;
    }
    public int getLid() {
        return lid;
    }
    public void setLid(int lid) {
        this.lid = lid;
    }
    public String getLname() {
        return lname;
    }
    public void setLname(String lname) {
        this.lname = lname;
    }
    public int getLprice() {
        return lprice;
    }
    public void setLprice(int lprice) {
        this.lprice = lprice;
    } 
    public int getLwarranty()
    {
        return lwarranty;
    }
    public void setLwarranty(int lwarranty)
    {
        this.lwarranty=lwarranty;
    }
}
