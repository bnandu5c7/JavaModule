package com.kpit.airline.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
    @Id
    @Column(name="fid")
    private  int fid;
    @Column(name="fname")
    private String fname;
    @Column(name="fsource")
    private String fsource;
    @Column(name="fdestination")
    private String fdestination;
    public Flight() {
    }
    public Flight(int fid, String fname, String fsource, String fdestination) {
        this.fid = fid;
        this.fname = fname;
        this.fsource = fsource;
        this.fdestination = fdestination;
    }
    public int getFid() {
        return fid;
    }
    public void setFid(int fid) {
        this.fid = fid;
    }
    public String getFname() {
        return fname;
    }
    public void setFname(String fname) {
        this.fname = fname;
    }
    public String getFsource() {
        return fsource;
    }
    public void setFsource(String fsource) {
        this.fsource = fsource;
    }
    public String getFdestination() {
        return fdestination;
    }
    public void setFdestination(String fdestination) {
        this.fdestination = fdestination;
    }    
}
