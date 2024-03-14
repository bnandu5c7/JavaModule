package com.kpit.demo16.Layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo16.Layer2.Flight;
import com.kpit.demo16.Layer4.FlightService;

@RestController
public class FlightController {
    @Autowired
    FlightService fserv;
    @PostMapping("/insert")
     public Flight addflight(@RequestBody Flight obj) {
      return fserv.addflight(obj); 
    }
    @PutMapping("/update/{id}")
    public Flight modifyflight(@PathVariable int id,@RequestBody Flight uobj) {
        return fserv.modifyflight(id,uobj);
    }
    @DeleteMapping("/dlt/{id}")
    public void delete( @PathVariable int id) {
        fserv.delete(id);
      }
      @GetMapping("/view/{id}")
      public Flight show(@PathVariable int id) {
 
        return fserv.show(id);   
      }
      @GetMapping("/viewAll")
      public List<Flight> showAll() {
        return fserv.showAll();
    }

}
