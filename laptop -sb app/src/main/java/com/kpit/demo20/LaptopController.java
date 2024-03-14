package com.kpit.demo20;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LaptopController {
    @Autowired
    LaptopService lservice;
    @PostMapping("/creat")
    public Laptop addLap(@RequestBody Laptop aobj) {
        return lservice.addLap(aobj);
    }
    @PutMapping("/update/{id}")
    public Laptop modify(@PathVariable int id,@RequestBody Laptop eobj) {
        return lservice.modify(id,eobj);
    }
    @DeleteMapping("/delete/{id}")
    public void remove(@PathVariable int id) {
        lservice.remove(id);
    }
    @GetMapping("/show/{id}")
    public Laptop display(@PathVariable int id) {
        return  lservice.display(id);
     }
    @GetMapping("/showAll")
     public List<Laptop> displayAll() {
        return lservice.displayAll();
    }
}
