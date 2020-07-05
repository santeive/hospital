package ui;

import model.Doctor;
import model.Patient;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

//Métodos estaticos,
// Éstos métodos se pueden llamar sin necesidad de instanciar un objeto de esa clase.
public class UIMenu {
    public static final String[] MONTHS = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre"};
    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu() throws ParseException {
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("3. Administrador");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            authUser(1);

            switch (response){
                case 1:
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    authUser(2);
                    break;
                case 3:
                    System.out.println("Administrator");
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        }while (response != 0);
    }

    private static void authUser(int userType) throws ParseException {
        //userType = 1 Doctor
        //userType = 2 Paciente
        //userType = 3 Administrador

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Matrinez", "ale@doctor.com"));
        doctors.add(new Doctor("Pamela Matrinez", "pamela@doctor.com"));
        doctors.add(new Doctor("Andrea Matrinez", "andrea@doctor.com"));

        ArrayList<Patient> pacientes = new ArrayList<>();
        pacientes.add(new Patient("Roberto Snachez", "rob@paciente.com"));
        pacientes.add(new Patient("Francisco Garcia", "frank@paciente.com"));
        pacientes.add(new Patient("Diana Salazar", "diana@paciente.com"));

        boolean emailCorrect = false;
        do{
            System.out.println("Insert your email: a@gmail.com");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if(userType == 1){
                for(Doctor d: doctors){
                    if(d.getEmail().equals(email)){
                        emailCorrect = true;
                        //Obtener el usuario logeado
                        doctorLogged = d;
                        //Show doctor menu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            }

            if(userType == 2) {
                for (Patient p: pacientes) {
                    if(p.getName().equals(email)) {
                        emailCorrect = true;
                        //Obtener el usuario Logeado
                        patientLogged = p;
                        //Show menu Patient

                    }
                }

            }
        }while(!emailCorrect);
    }

    public static void showPatientMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    break;
                case 2:
                    for (int i = 0; i < 3; i++) {
                        System.out.println(i + "." + MONTHS[i]);
                    }
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }
}
