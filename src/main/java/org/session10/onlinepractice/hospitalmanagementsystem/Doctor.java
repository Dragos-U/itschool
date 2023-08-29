package org.session10.onlinepractice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Doctor extends User {

    private String specialization;
    private List<Patient> patients;

    public Doctor(String name, String specialization) {
        super.setName(name);
        this.specialization = specialization;
        this.patients = new ArrayList<>();
    }

    public String getSpecialization() {
        return specialization;
    }

    public List<Patient> getPatients() {
        return patients;
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }

    public String getName(){
        return super.getName();
    }
}
