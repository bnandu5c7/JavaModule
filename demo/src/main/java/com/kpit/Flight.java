package com.kpit;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

  @Entity
    @Table(name="flight_tbl")
  
public class Flight {

    
       @Id
       @Column(name ="flightNo")
       private int flightNo;


       @Column(name ="flightName")
       private String flightName;

       @Column(name ="source")
       private String source;

       @Column(name ="destination")
       private String destination;


    public Flight(int flightNo, String flightName, String source, String destination) {
        this.flightNo = flightNo;
        this.flightName = flightName;
        this.source = source;
        this.destination = destination;
    }
    
    public Flight() {
    }

    public int getFlightNo() {
        return flightNo;
    }
    public String getFlightName() {
        return flightName;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public void setFlightNo(int flightNo) {
        this.flightNo = flightNo;
    }
    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }

    
}
