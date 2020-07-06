package ui;

import model.Doctor;
import model.Patient;

import java.text.ParseException;
import java.util.Scanner;

public class UIAdminMenu {
    public static void showAdminMenu() throws ParseException {
        int response = 0;
        do {
            System.out.println("1. Add Doctor");
            System.out.println("2. Add Pacient");
            System.out.println("0. Return");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    //Add Doctor
                    addDateDoctor();
                    break;
                case 2:
                    //Add Pacient
                    addDatePatient();
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println("Select a correct option");
                    break;
            }

        }while (response != 0);
    }

    public static void addDateDoctor() {
        Scanner sc = new Scanner(System.in);
        int response = 0;
        String name = "";
        String email ="";
        do {
            System.out.println("Insert name's doctor");
            name = sc.nextLine();
            System.out.println("Insert email's doctor");
            email = sc.nextLine();
            System.out.println("The doctor is: " + name + " email: " + email);
            System.out.println("1. Correct 2. Change");
            response = Integer.valueOf(sc.nextLine());
        }while (response == 2);
        UIMenu.adminLogged.addDoctor(name, email);
        for (Doctor d: UIMenu.adminLogged.getAvailableDoctors()) {
            System.out.println(d.getName());
        }
    }

    public static void addDatePatient() {
        Scanner sc = new Scanner(System.in);
        int response = 0;
        String name = "";
        String email = "";

        do {
            System.out.println("Insert patient's name");
            name = sc.nextLine();
            System.out.println("Insert patient's email");
            email = sc.nextLine();
            System.out.println("The patient is: " + name + " email: " + email);
            System.out.println("1. Correct 2. Change");
            response = Integer.valueOf(sc.nextLine());
        }while (response == 2);
        UIMenu.adminLogged.addPatient(name, email);
        for (Patient p: UIMenu.adminLogged.getAvailablePatients()) {
            System.out.println(p.getName());
        }
    }



}
