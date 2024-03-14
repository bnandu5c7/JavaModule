package com.kpit.demo20;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopServiceImpl implements LaptopService {
 @Autowired
 LaptopRepository lrepo;
    @Override
    public Laptop addLap(Laptop aobj) {
        return lrepo.save(aobj);
    }
    @Override
    public Laptop modify(int id, Laptop eobj) {
       Laptop l= lrepo.findById(id);
       if(eobj.getLname()!= null)
       {
           l.setLname(eobj.getLname());
       }
       if(eobj.getLprice()!=0)
       {
        l.setLprice(eobj.getLprice());
       }
       return lrepo.save(l);
    }
    @Override
    public void remove(int id) {
        lrepo.deleteById(id);
    }
    @Override
    public Laptop display(int id) {
       return  lrepo.findById(id);
    }
    @Override
    public List<Laptop> displayAll() {
        return lrepo.findAll();
    }
    
    
}
