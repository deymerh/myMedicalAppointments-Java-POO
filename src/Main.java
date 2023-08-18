import model.Doctor;
import model.Nurse;
import model.Patient;
import model.User;

import javax.jws.soap.SOAPBinding;
import java.util.Date;
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        showMenu();
        /**
        Doctor myDoctor = new Doctor("Deymer", "Frontend Developer!");

        Doctor myDoctor2 = new Doctor( "Nure", "Ama de casa");

        Doctor doctor = new Doctor("Deymer", "deymerh@hotmail.com");
        doctor.setSpeciality("Oncologo");
        doctor.showDataUser();

        Nurse nurse = new Nurse("Nure", "nure@hotmail.com");
        nurse.setSpeciality("Inyectology");
        nurse.showDataUser();

        Patient patient = new Patient("Tiago", "tiago@tiago.com");
        patient.showDataUser();

        System.out.println();
        System.out.println();
        User user1 = new User("Deymer", "deymer@deymer.com") {
            @Override
            public void showDataUser() {
                System.out.println("Ahora ya no quiero ver ninguna info");
            }
        };
        user1.showDataUser();
        myDoctor2.showSpeciality();

        myDoctor.addAvailableAppointemn(new Date(), "3:00PM");
        myDoctor.addAvailableAppointemn(new Date(), "10:00PM");
        myDoctor.addAvailableAppointemn(new Date(), "20:00PM");

        myDoctor2.addAvailableAppointemn(new Date(), "9:00AM");
        myDoctor2.addAvailableAppointemn(new Date(), "11:00AM");

        myDoctor.getAvailableAppointemts().forEach((element) -> {
            System.out.println("ELEMENT-getTime(): " + element.getTime());
            System.out.println("ELEMENT-getDate(): " + element.getDate());
        });

        for (Doctor.AvailableAppointemn element: myDoctor.getAvailableAppointemts()) {
            System.out.println("Las cita programadas del model.Doctor son " + element.getDate() + " - " + element.getTime());
        }

        System.out.println();
        System.out.println();
        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient); // This is called the method toString() of patient

        // showMenu();
        model.Patient patient = new model.Patient("Deymer patient", "deymer@emila.com");
        System.out.println("model.Patient: " + patient.name);
        patient.setPhoneNumber("1234567891");
        System.out.println("Numero movil: " + patient.getPhoneNumber());
        */
    }


}