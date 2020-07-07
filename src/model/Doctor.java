package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Doctor extends User {
    //Atributo
    private String speciality;

    //Sobrecarga de constructores
    public Doctor(String name, String email){
        super(name, email);
    }

    //La implementación de los metodos abrstractos es obligatoria
    // Y la implementación es distinta de acuerdo a la clase hija
    @Override
    public void ShowDataUser() {
        System.out.println("Aquí definimos showDataUser para Doctor");
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    //Metodos
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    public void addAvailableAppointment(String date, String time) {
        availableAppointments.add(new Doctor.AvailableAppointment(date, time));
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments() {
        return availableAppointments;
    }

    //Clase ANIDADA
    //Obedecen a una lógia del negocio
    //Puedes ser accedidas a través de la clase envolvente
    /*Si empieza a tener muchos atributos se debe considerar
    si es necesario tener una clase anidada o que esos atributos formen
    parte la clase principal o envolvente */

    public static class AvailableAppointment {
        private int id;
        private Date date;
        private String time;
        //Para parsear la fecha
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time){
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate(String DATE) {
            return date;
        }

        public String getDate() {
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
