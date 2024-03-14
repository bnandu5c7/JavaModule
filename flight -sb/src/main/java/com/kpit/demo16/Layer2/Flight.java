package com.kpit.demo16.Layer2;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {
@Id
@Column(name="fid")
private int fid;
@Column(name="fname")
private String fname;
@Column(name="fprice")
private int fprice;
@Column(name="fsource")
private String fsource;
@Column(name="fdestination")
private String fdestination;
public Flight() {
}
public Flight(int fid, String fname, int fprice, String fsource, String fdestination) {
    this.fid = fid;
    this.fname = fname;
    this.fprice = fprice;
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
public int getFprice() {
    return fprice;
}
public void setFprice(int fprice) {
    this.fprice = fprice;
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
