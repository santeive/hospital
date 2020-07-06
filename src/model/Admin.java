package model;

import java.util.ArrayList;

public class Admin extends User {

    public static ArrayList<Doctor> availableDoctors = new ArrayList<>();
    public static ArrayList<Patient> availablePatients = new ArrayList<>();

    public Admin(String name, String email) {
        super(name, email);
    }

    public ArrayList<Doctor> getAvailableDoctors() {
        return availableDoctors;
    }

    public void setAvailableDoctors(ArrayList<Doctor> availableDoctors) {
        this.availableDoctors = availableDoctors;
    }

    public ArrayList<Patient> getAvailablePatients() {
        return availablePatients;
    }

    public void setAvailablePatients(ArrayList<Patient> availablePatients) {
        this.availablePatients = availablePatients;
    }

    public void addDoctor(String name, String email){
        availableDoctors.add(new Doctor(name, email));
    }

    public void addPatient(String name, String email) {
        availablePatients.add(new Patient(name, email));
    }

    @Override
    public void ShowDataUser() {
        System.out.println("Soy el administrador");
    }


}
