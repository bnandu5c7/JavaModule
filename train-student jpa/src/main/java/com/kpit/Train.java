package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
//import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="TrainDetails")
public class Train {
 @Id
 @Column(name="tId")
 private int tId;
  @Column(name="tName")
 private String tName;
  @Column(name="tSource")
 private String tSource;
  @Column(name="tDest")
 private String tDest;
  @Column(name="tArraival")
 private String tArraival;

public int gettId() {
    return tId;
}

public Train() {
}

public Train(int tId, String tName, String tSource, String tDest, String tArraival) {
    this.tId = tId;
    this.tName = tName;
    this.tSource = tSource;
    this.tDest = tDest;
    this.tArraival = tArraival;
}
public void settId(int tId) {
    this.tId = tId;
}
public String gettName() {
    return tName;
}
public void settName(String tName) {
    this.tName = tName;
}
public String gettSource() {
    return tSource;
}
public void settSource(String tSource) {
    this.tSource = tSource;
}
public String gettDest() {
    return tDest;
}
public void settDest(String tDest) {
    this.tDest = tDest;
}
public String gettArraival() {
    return tArraival;
}
public void settArraival(String tArraival) {
    this.tArraival = tArraival;
}

 
}
    
    
