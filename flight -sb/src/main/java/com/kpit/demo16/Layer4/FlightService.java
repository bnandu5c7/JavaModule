package com.kpit.demo16.Layer4;

import java.util.List;

import com.kpit.demo16.Layer2.Flight;

public interface FlightService{
    Flight addflight(Flight obj);
    Flight modifyflight(int id,Flight uobj);
    void delete(int id);
    Flight show(int id);
    List<Flight> showAll();
}
