package com.kpit.demo16.Layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.demo16.Layer2.Flight;
@Repository
public interface FlightRepository extends CrudRepository<Flight,Integer> {
    Flight findById(int id);
    List<Flight> findAll();
}
