package com.kpit.demo16.Layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo16.Layer2.Flight;
import com.kpit.demo16.Layer3.FlightRepository;

@Service
public class FlightServiceImpl implements FlightService {
 @Autowired
 FlightRepository frepo;
    @Override
    public Flight addflight(Flight obj) {
      return frepo.save(obj); 
    }
    @Override
    public Flight modifyflight(int id, Flight uobj) {
      Flight f=frepo.findById(id);
      if(uobj.getFname()!=null)
      {
        f.setFname(uobj.getFname());
      }
      if(uobj.getFsource()!=null)
      {
        f.setFsource(uobj.getFsource());
      }
      if(uobj.getFdestination()!=null)
      {
        f.setFdestination(uobj.getFdestination());
      }
      return frepo.save(f);
    }
    @Override
    public void delete(int id) {
      frepo.deleteById(id);
    }
    @Override
    public Flight show(int id) {

      return frepo.findById(id);   
    }
    @Override
    public List<Flight> showAll() {
    return frepo.findAll();
    }
    
    }
