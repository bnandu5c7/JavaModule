package com.kpit.demo14.Layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo14.Layer2.Patient;
import com.kpit.demo14.Layer3.PatientRepository;
@Service
public class PatientServiceImpl implements PatientService {
   @Autowired
   PatientRepository prepo;
    @Override
    public Patient addPatient(Patient p) {
      return prepo.save(p);
    }
    @Override
    public Patient modifyPatient(int id, Patient eobj) {
       Patient p=prepo.findById(id);
       if(eobj.getPname()!=null)
       {
         p.setPname(eobj.getPname());
       }
       if(eobj.getPage()!=0)
       {
        p.setPage(eobj.getPage());
       }
       if(eobj.getPtreat()!=null)
       {
          p.setPtreat(eobj.getPtreat());
       }
       return prepo.save(p);
    }
    @Override
    public void deletePatient(int id) {
       prepo.deleteById(id);
    }
    @Override
    public Patient viewSinglePatient(int id) {
        return prepo.findById(id);
    }
    @Override
    public List<Patient> viewAllPatients() {
        return prepo.findAll();
    }
    
}
