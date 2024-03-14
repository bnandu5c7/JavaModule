package com.kpit.demo19.Layer4;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpit.demo19.Layer2.Mobile;
import com.kpit.demo19.Layer3.MobileRepository;
@Service
public class MobileServiceImpl  implements MobileService {
 @Autowired
 MobileRepository mrepo;

    @Override
    public Mobile addMobile(Mobile aobj) {
        return mrepo.save(aobj);
       
    }

    @Override
    public Mobile modifyMobile(int id,Mobile uobj) {
      Mobile m= mrepo.findById(id);
      if(uobj.getMname()!=null)
      {
        m.setMname(uobj.getMname());
      }
      if(uobj.getMcost()!=0)
      {
        m.setMcost(uobj.getMcost());
      }
      return mrepo.save(m);
      
    }

    @Override
    public void removeMobile(int id) {
        mrepo.deleteById(id);
    }

    @Override
    public Mobile display(int id) {
     return mrepo.findById(id);
    }

    @Override
    public List<Mobile> displayAll() {
     return mrepo.findAll();
    }
    
}
