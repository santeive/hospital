package model;

import java.util.ArrayList;

public class Admin extends User {

    public Admin(String name, String email) {
        super(name, email);
    }
    ArrayList<Doctor> availableDoctors = new ArrayList<>();

    public ArrayList<Doctor> getAvailableDoctors() {
        return availableDoctors;
    }

    public void setAvailableDoctors(ArrayList<Doctor> availableDoctors) {
        this.availableDoctors = availableDoctors;
    }

    public void addDoctor(String name, String email){
        availableDoctors.add(new Doctor(name, email));
    }

    @Override
    public void ShowDataUser() {
        System.out.println("Soy el administrador");
    }


}
