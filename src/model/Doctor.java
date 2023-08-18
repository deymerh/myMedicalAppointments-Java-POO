package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
    private String speciality;

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email) {
        super(name, email);
    }

    ArrayList<AvailableAppointemn> availableAppointemts = new ArrayList<>();
    public void addAvailableAppointment(String date, String time) {
        availableAppointemts.add(new Doctor.AvailableAppointemn(date,time));
    }

    public ArrayList<AvailableAppointemn> getAvailableAppointment() {
        return availableAppointemts;
    }

    @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointemts.toString();
    }

    @Override
    public void showDataUser() {
        System.out.println("I am a Doctor with speciality of: " + getSpeciality());
    }

    public static class AvailableAppointemn{
        private int id_availableAppointment;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        public AvailableAppointemn(String date, String time) {
            try {
                this.date = format.parse(date);
            }catch (ParseException error){
                error.printStackTrace();
            };
            this.time = time;
        }

        public Date getDate(String DATE) {
            return date;
        }
        public String getDate() {
            return format.format(date);
        }

        public void setDate(String date) {
            try {
                this.date = format.parse(date);
            }catch (ParseException error){
                error.printStackTrace();
            };
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        @Override
        public String toString() {
            return "Available Appointments \nDate: " +date+ "\nTime: " + time;
        }
    }
}
