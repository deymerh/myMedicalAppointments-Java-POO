package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {
    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();
    public static void showDcotorMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome " + UIMenu.doctorLogged.getName());
            System.out.println("1. Add avaliable appointment");
            System.out.println("2. My Schedule appointment");
            System.out.println("0. Logount");

            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            switch (response){
                case 1:
                    System.out.println("Doctor");
                    break;
                case 2:
                    System.out.println("Patient");
                    // showPatientMenu();
                    response = 0;
                    break;
                case 0:
                    System.out.println("Thank you for you visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }

        }while (response != 0);
    }
    public static void showAddAvailableAppointmentsMenu(){
        int response = 0;
        System.out.println();
        System.out.println("Add available appointment");
        System.out.println("Select a month");

        do {
            for (int i = 0; i < 3; i++){
                int j = i + i;
                System.out.println(j + "." + UIMenu.MONTHS[i]);
            }
            System.out.println("0. Return");
            Scanner scanner = new Scanner(System.in);
            response = Integer.valueOf(scanner.nextLine());

            if(response > 0 && response < 4){
                int monthSelected = response;
                System.out.println(monthSelected + " . " + UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Insert the date available [dd/mm/yyyy]");
                String date = scanner.nextLine();
                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change date");
                int responseDate = Integer.valueOf(scanner.nextLine());
                if (responseDate == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: " + date + " [16:00]");
                    time = scanner.nextLine();
                    System.out.println("Your time is: " + time + "\n1. Correct \n2. Change Time");
                    responseTime = Integer.valueOf(scanner.nextLine());
                }while (responseTime == 0);
                UIMenu.doctorLogged.addAvailableAppointment(date,time);
                checkDoctorAvailableAppointments(UIMenu.doctorLogged);
            }else if (response == 0){
                showDcotorMenu();
            }

        }while (response != 0);
    }
    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointment().size() > 0 && !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);
        }
    }
}
