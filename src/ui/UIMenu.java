package ui;

import model.Doctor;
import model.Patient;

import java.util.ArrayList;
import java.util.Scanner;
public class UIMenu {
    private static final int numberMountMax = 4;
    public static Doctor doctorLogged;
    public static Patient patientLogged;
    public final static String[] MONTHS = {
            "Enero",
            "Febrero",
            "Marzo",
            "Abril",
            "Mayo",
            "Junio",
            "Julio",
            "Agosto",
            "Septiembre",
            "Octubre",
            "Noviembre",
            "Diciembre",
    };
    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opción deseada");

        int response = 0;
        do {
            System.out.println("1. Doctor");
            System.out.println("2. Patient");
            System.out.println("0. Salir");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    authUser(1);
                    break;
                case 2:
                    System.out.println("Patient");
                    response = 0;
                    authUser(2);
                    // showPatientMenu();
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    UIMenu.showMenu();
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    private static void authUser(int userType){

        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Melissa", "melisa@melisa.com"));
        doctors.add(new Doctor("Lorem", "lorem@lorem.com"));
        doctors.add(new Doctor("Nure", "nure@nure.com"));

        ArrayList<Patient> patients = new ArrayList<>();
        patients.add(new Patient("Pedro", "pedro@pedro.com"));
        patients.add(new Patient("Jeronima", "jeronima@jeronima.com"));
        patients.add(new Patient("Tiago", "tiago@nure.com"));

        boolean emailCorrect = false;

        do {
            System.out.println("Insert your emial: [a@a.com]");
            Scanner scanner = new Scanner(System.in);
            String emial = scanner.nextLine();

            if (userType == 1){
                for (Doctor doctor: doctors) {
                    if (doctor.getEmail().equals(emial)){
                        emailCorrect = true;
                        doctorLogged = doctor;
                        System.out.println("Correo econtrado!");
                        UIDoctorMenu.showDcotorMenu();
                    };
                }
            }

            if (userType == 2){
                for (Patient patient: patients) {
                    if (patient.getEmail().equals(emial)){
                        emailCorrect = true;
                        patientLogged = patient;
                        System.out.println("Correo econtrado!");
                        UIPatientMenu.showPatientMenu();
                    };
                }
            }
        }while (!emailCorrect);
    }

    /**
    private void findAndSetUserByEmail(ArrayList<User> users, String email) {
        for (User user: users) {
            if (user.getEmail().equals(email)){
                emailCorrect = true;
                doctorLogged = user;
                System.out.println("Correo econtrado!");
            };
        }
    }*/

    public static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Return");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int positionCicle = 0; positionCicle < numberMountMax; positionCicle++) {
                        System.out.println(positionCicle + "." + MONTHS[positionCicle]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        } while (response != 0);
    }
}
