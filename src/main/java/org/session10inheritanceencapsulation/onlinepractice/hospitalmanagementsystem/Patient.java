package org.session10inheritanceencapsulation.onlinepractice.hospitalmanagementsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Patient extends User {

    private int age;
    private List<String> medicalHistory;
    private UUID patientID;

    public Patient(String name, int age) {
        super.setName(name);
        this.age = age;
        this.patientID = UUID.randomUUID();
        this.medicalHistory = new ArrayList<>();
    }

    public String getName() {
        return super.getName();
    }

    public UUID getPatientID() {
        return patientID;
    }

    private List<String> getMedicalHistory() {
        return medicalHistory;
    }

    private void addMedicalEvent(String medicalEvent){
        medicalHistory.add(medicalEvent);
    }
}
