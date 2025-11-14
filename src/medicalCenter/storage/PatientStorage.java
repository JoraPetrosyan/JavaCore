package medicalCenter.storage;

import medicalCenter.model.Doctor;
import medicalCenter.model.Patient;

public class PatientStorage {

    private Patient[] patientStorage = new Patient[10];
    private int size = 0;

    public void addPatient(Patient patient) {
        if (size == patientStorage.length) {
            extend();
        }
        patientStorage[size++] = patient;
    }

    private void extend() {
        Patient[] tmp = new Patient[size + 10];
        System.arraycopy(patientStorage, 0, tmp, 0, size);
        patientStorage = tmp;
    }

    public void printAllPatientsByDoctor(Doctor doctor) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            if (patientStorage[i].getDoctor().equals(doctor)) {
                System.out.println(patientStorage[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No patients found for this doctor.");
        }
    }

    public void printAllPatient() {
        for (int i = 0; i < size; i++) {
            System.out.println(patientStorage[i]);
        }
    }
}

