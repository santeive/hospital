package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User{
    //Atributos
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentNurses = new ArrayList<>();
    private ArrayList<Patient> availablePatients = new ArrayList<>();

    public Patient(String name, String email) {
        //Cómo los atributos name e email ya no forman parte de la clase Patient, se deben pasar a
        // super por que pertenecen a la clase padre.
        super(name, email);
    }

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentNurses() {
        return appointmentNurses;
    }

    public void setAppointmentNurses(ArrayList<AppointmentNurse> appointmentNurses) {
        this.appointmentNurses = appointmentNurses;
    }

    public ArrayList<Patient> getAvailablePatients() {
        return availablePatients;
    }

    public void setAvailablePatients(ArrayList<Patient> availablePatients) {
        this.availablePatients = availablePatients;
    }

    //La implementación de los metodos abrstractos es obligatoria
    // Y la implementación es totalmente personalizada
    @Override
    public void ShowDataUser() {
        System.out.println("Aqui vamos a definir otro medoto para paciente");
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public void addPatient(String name, String email) {
        availablePatients.add(new Patient(name, email));
    }
}
