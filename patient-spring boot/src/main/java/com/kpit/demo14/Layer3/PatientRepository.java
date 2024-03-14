package com.kpit.demo14.Layer3;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.kpit.demo14.Layer2.Patient;
@Repository
public interface PatientRepository extends CrudRepository<Patient,Integer> {
    Patient findById(int id);
    List<Patient> findAll();
}
