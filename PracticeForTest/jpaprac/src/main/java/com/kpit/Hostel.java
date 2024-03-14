package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Hostel")
public class Hostel {
    @Id
    @Column(name="hid")
    private int hid;
    @Column(name="hname")
    private String hname;
    @Column(name="hplace")
    private String hplace;
    @Column(name="hrent")
    private int hrent;
    
   
    public Hostel() {
    }
    public Hostel(int hid, String hname, String hplace, int hrent) {
        this.hid = hid;
        this.hname = hname;
        this.hplace = hplace;
        this.hrent = hrent;
    }
    public int getHid() {
        return hid;
    }
    public void setHid(int hid) {
        this.hid = hid;
    }
    public String getHname() {
        return hname;
    }
    public void setHname(String hname) {
        this.hname = hname;
    }
    public String getHplace() {
        return hplace;
    }
    public void setHplace(String hplace) {
        this.hplace = hplace;
    }
    public int getHrent() {
        return hrent;
    }
    public void setHrent(int hrent) {
        this.hrent = hrent;
    }
    


    
}
