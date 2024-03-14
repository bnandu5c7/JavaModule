package com.kpit.demo19.Layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo19.Layer2.Mobile;
import com.kpit.demo19.Layer4.MobileService;

@RestController
// @RequestMapping("/Mobile")
// @CrossOrigin(origins = "http://localhost:4200")
public class MobileController {
    @Autowired
    MobileService ms;
    @PostMapping("/add")
     public Mobile addMobile(@RequestBody Mobile aobj) {
        return ms.addMobile(aobj);
       
    }
    @PutMapping("/update/{id}")
    public Mobile modifyMobile(@PathVariable int id, @RequestBody Mobile uobj) {
        return ms.modifyMobile(id,uobj);
      
    }
    @DeleteMapping("/delete/{id}")
    public void removeMobile(@PathVariable int id) {
        ms.removeMobile(id);
    }
    @GetMapping("/show/{id}")
    public Mobile display(@PathVariable int id) {
        return ms.display(id);
       }
     @GetMapping("/showAll")
     public List<Mobile> displayAll() {
     return ms.displayAll();
    }
    
}
