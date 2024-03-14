package com.kpit.demo19.Layer4;

import java.util.List;

import com.kpit.demo19.Layer2.Mobile;
public interface MobileService {
    Mobile addMobile(Mobile aobj);
    Mobile modifyMobile(int id,Mobile uobj);
    void removeMobile(int id);
    Mobile display(int id);
    List<Mobile> displayAll();
}
