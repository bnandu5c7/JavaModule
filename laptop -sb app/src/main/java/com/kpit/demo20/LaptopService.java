package com.kpit.demo20;

import java.util.List;

public interface LaptopService {
    Laptop addLap(Laptop aobj);
    Laptop modify(int id,Laptop eobj);
    void remove(int id);
    Laptop display(int id);
    List<Laptop> displayAll();
}
