package medicalCenter.commands;

public interface CommandField {
    String EXIT = "0";
    String ADD_DOCTOR = "1";
    String SEARCH_DOCTOR_BY_PROFESSION = "2";
    String DELETE_DOCTOR_BY_ID = "3";
    String PRINT_ALL_DOCTOR = "4";
    String CHANGE_DOCTOR_BY_ID = "5";
    String ADD_PATIENT = "6";
    String PRINT_ALL_PATIENTS_BY_DOCTOR = "7";
    String PRINT_ALL_PATIENT = "8";

    static void printDoctorAndPatientCommands() {
        System.out.println("Pleas input " + EXIT + " for EXIT");
        System.out.println("Pleas input " + ADD_DOCTOR + " for ADD_DOCTOR");
        System.out.println("Pleas input " + SEARCH_DOCTOR_BY_PROFESSION + " for SEARCH_DOCTOR_BY_PROFESSION");
        System.out.println("Pleas input " + DELETE_DOCTOR_BY_ID + " for DELETE_DOCTOR_BY_ID");
        System.out.println("Pleas input " + PRINT_ALL_DOCTOR + " for PRINT_ALL_DOCTOR ");
        System.out.println("Pleas input " + CHANGE_DOCTOR_BY_ID + " for CHANGE_DOCTOR_BY_ID");
        System.out.println("Pleas input " + ADD_PATIENT + " for ADD_PATIENT");
        System.out.println("Pleas input " + PRINT_ALL_PATIENTS_BY_DOCTOR + " for PRINT_ALL_PATIENTS_BY_DOCTOR");
        System.out.println("Pleas input " + PRINT_ALL_PATIENT + " for PRINT_ALL_PATIENT");
    }
}

