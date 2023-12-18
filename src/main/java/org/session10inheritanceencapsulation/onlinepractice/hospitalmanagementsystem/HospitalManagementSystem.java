package org.session10inheritanceencapsulation.onlinepractice.hospitalmanagementsystem;

public class HospitalManagementSystem {

    public static void main(String[] args) {
        Patient patient1 = new Patient("John", 55);
        Patient patient2 = new Patient("Claire", 65);
        Patient patient3 = new Patient("Bob", 34);

        Doctor doctor1 = new Doctor("Jones", "Urology");
        Doctor doctor2 = new Doctor("Jake", "Radiology");
        Doctor doctor3 = new Doctor("Jane", "Gynecology");

        Hospital reginaMaria = new Hospital();

        reginaMaria.admitPatient(patient1);
        reginaMaria.admitPatient(patient2);
        reginaMaria.admitPatient(patient3);

        for (Patient patient : reginaMaria.getPatients()){
            System.out.println("Patient :"+patient.getName());
        }
    }
}
