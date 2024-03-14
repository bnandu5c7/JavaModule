package com.kpit.demo14.layer5;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kpit.demo14.Layer2.Patient;
import com.kpit.demo14.Layer4.PatientService;

@RestController
public class PatientController {
    @Autowired
    PatientService pserve;
    @PostMapping("/insert")
    public Patient addPatient(@RequestBody Patient p) {
      return pserve.addPatient(p);
    }
    @PutMapping("/update/{id}")
    public Patient modifyPatient(@PathVariable int id,@RequestBody Patient eobj) {
        return pserve.modifyPatient(id,eobj);
    }
    @DeleteMapping("/remove/{id}")
    public void deletePatient(@PathVariable int id) {
        pserve.deletePatient(id);
     }
     @GetMapping("/show/{id}")
     public Patient viewSinglePatient(@PathVariable int id) {
        return pserve.viewSinglePatient(id);
    }
    @GetMapping("/showAll")
     public List<Patient> viewAllPatients() {
        return pserve.viewAllPatients();
    }
}
