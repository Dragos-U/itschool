package org.session10.onlinepractice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

    private List<Patient> patients = new ArrayList<>();
    private List<Doctor> doctors = new ArrayList<>();

    public void admitPatient(Patient patient){
        patients.add(patient);
    }

    public List<Patient> getPatients(){
        return patients;
    }
}
