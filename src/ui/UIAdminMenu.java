package ui;

import model.Doctor;

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
                    break;
                case 0:
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println("Select a correct answer");
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
    }



}
