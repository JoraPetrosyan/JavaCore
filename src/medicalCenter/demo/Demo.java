package medicalCenter.demo;

import medicalCenter.commands.CommandField;
import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;
import medicalCenter.util.FileUtil;
import medicalCenter.storage.DoctorStorage;
import medicalCenter.storage.PatientStorage;

import java.util.Date;
import java.util.Scanner;

public class Demo implements CommandField {
    private static Scanner scanner = new Scanner(System.in);
    private static DoctorStorage doctorStorage = FileUtil.deserializeDoctorStorage();
    private static PatientStorage patientStorage = FileUtil.deserializePatientStorage();

    public static void main(String[] args) {

        boolean isRun = true;
        while (isRun) {
            CommandField.printDoctorAndPatientCommands();
            String command = scanner.nextLine();
            switch (command) {
                case EXIT:
                    isRun = false;
                    break;
                case ADD_DOCTOR:
                    addDoctor();
                    FileUtil.serializeDoctorData(doctorStorage);
                    break;
                case SEARCH_DOCTOR_BY_PROFESSION:
                    searchDoctorByProfession();
                    break;
                case DELETE_DOCTOR_BY_ID:
                    System.out.println("Please input id");
                    String id = scanner.nextLine();
                    doctorStorage.deleteDoctorById(Integer.parseInt(id));
                    break;
                case PRINT_ALL_DOCTOR:
                    doctorStorage.print();
                    break;
                case CHANGE_DOCTOR_BY_ID:
                    changeDoctorById();
                    break;
                case ADD_PATIENT:
                    addPatient();
                    FileUtil.serializePatientData(patientStorage);
                    break;
                case PRINT_ALL_PATIENTS_BY_DOCTOR:
                    printPatientsByDoctor();
                    break;
                case PRINT_ALL_PATIENT:
                    patientStorage.printAllPatient();
            }
        }
    }

    private static void addDoctor() {
        try {
            System.out.println("Pleas input doctor's id");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Pleas input doctor's name");
            String name = scanner.nextLine();
            System.out.println("Pleas input doctor's surname");
            String surname = scanner.nextLine();
            System.out.println("Pleas input doctor's email ");
            String email = scanner.nextLine();
            System.out.println("Pleas input doctor's phoneNumber");
            String phoneNumber = scanner.nextLine();
            System.out.println("Pleas input doctor's profession");
            String profession = scanner.nextLine();
            Doctor doctor = new Doctor(id, name, surname, phoneNumber, email, profession);
            doctorStorage.addDoctor(doctor);
            System.out.println("Doctor added successfully");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
    private static void changeDoctorById() {
          System.out.println("Please input doctor's id to update");
          int id = Integer.parseInt(scanner.nextLine());
          Doctor doctor = doctorStorage.getDoctorById(id);
          if (doctor == null) {
              System.out.println("Doctor with this ID does not exist!");
              return;
          }
          System.out.println("Pleas input doctor's new name");
          String name = scanner.nextLine();
          System.out.println("Pleas input doctor's new surname");
          String surname = scanner.nextLine();
          System.out.println("Pleas input doctor's new email");
          String email = scanner.nextLine();
          System.out.println("Pleas input doctor's new phone number");
          String phoneNumber = scanner.nextLine();
          System.out.println("Pleas input doctor's new profession");
          String profession = scanner.nextLine();
        Doctor doctors = new Doctor(name,surname,phoneNumber,email,profession);
          doctorStorage.updateDoctor(doctors);
          System.out.println("Doctor updated successfully!");

    }

    private static void addPatient() {
        System.out.println("Pleas  choose Doctor by profession");
        doctorStorage.print();
        String profession = scanner.nextLine();
        Doctor doctor = doctorStorage.searchDoctorByProfession(profession);
        if (doctor != null) {
            System.out.println("Pleas input Patient's Id");
            int Id = Integer.parseInt(scanner.nextLine());
            System.out.println("Pleas input Patient's name");
            String name = scanner.nextLine();
            System.out.println("Pleas input Patient's surname");
            String surname = scanner.nextLine();
            System.out.println("Pleas input Patient's phoneNumber");
            String phoneNumber = scanner.nextLine();
            System.out.println("Pleas input Patient's email");
            String email = scanner.nextLine();
            Patient patient = new Patient(Id, name, surname, phoneNumber, email, doctor, new Date());
            patientStorage.addPatient(patient);
            System.out.println();
        }
    }

    private static void printPatientsByDoctor() {
        System.out.println("Enter doctor's profession");
        String profession = scanner.nextLine();
        Doctor doctor = doctorStorage.searchDoctorByProfession(profession);
        if (doctor == null) {
            System.out.println("Doctor not found!");
            return;
        }
        patientStorage.printAllPatientsByDoctor(doctor);
    }

    private static void searchDoctorByProfession() {
        System.out.println("Enter doctor's profession");
        String profession = scanner.nextLine();
        Doctor doctor = doctorStorage.searchDoctorByProfession(profession);
        ;
        if (doctor != null) {
            doctorStorage.searchDoctorByProfession(profession);
        } else {
            System.out.println("Wrong author's phone number, please try again!!!");
        }
    }

    private static void updateDoctor() {
        System.out.println("Enter doctor ID:");

        int id = scanner.nextInt();
        scanner.nextLine();
        Doctor doctor = doctorStorage.searchById(id);
        if (doctor == null) {
            System.err.println("No doctor found with that ID.");
            return;
        }
        System.out.println("Choose what you want to change:");

        System.out.println("Doctor updated successfully!");
    }


}