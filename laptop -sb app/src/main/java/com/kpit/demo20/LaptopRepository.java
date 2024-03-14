package com.kpit.demo20;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LaptopRepository extends CrudRepository<Laptop,Integer> {
    Laptop findById(int id);
    List<Laptop> findAll();
}
