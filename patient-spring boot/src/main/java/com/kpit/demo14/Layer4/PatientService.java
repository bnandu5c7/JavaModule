package com.kpit.demo14.Layer4;

import java.util.List;

import com.kpit.demo14.Layer2.Patient;

public interface PatientService {
    Patient addPatient(Patient pobj);
    Patient modifyPatient(int id,Patient eobj);
    void deletePatient(int id);
    Patient viewSinglePatient(int id);
    List<Patient> viewAllPatients();
}
