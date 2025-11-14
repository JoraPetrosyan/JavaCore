package medicalCenter.storage;

import medicalCenter.model.Doctor;

public class DoctorStorage {

    private Doctor[] doctorStorages = new Doctor[10];
    private int size = 0;

    public void addDoctor(Doctor doctor) {
        if (size == doctorStorages.length) {
            extend();
        }
        doctorStorages[size++] = doctor;
    }

    private void extend() {
        Doctor[] tmp = new Doctor[size + 10];
        System.arraycopy(doctorStorages, 0, tmp, 0, size);
        doctorStorages = tmp;
    }

    public Doctor searchDoctorByProfession(String profession) {
        for (int i = 0; i < size; i++) {
            if (doctorStorages[i].getProfession().toLowerCase().equals(profession)) {
                return doctorStorages[i];
            }
        }
        return null;
    }

    public void deleteDoctorById(int id) {
        for (int i = 0; i < size - 1; i++) {
            doctorStorages[id] = doctorStorages[size - 1];
        }
        size--;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(doctorStorages[i]);
        }
    }

    public Doctor searchById(int id) {
        for (Doctor doctor : doctorStorages) {
            if (doctor.getId() == id) {
                return doctor;
            }

        }
        return null;
    }

    public void updateDoctor(Doctor doctor) {
        for (int i = 0; i < size; i++) {
            if (doctorStorages[i].getId() == doctor.getId()) {
                doctorStorages[i] = doctor;
            }

            return;
        }
    }

    public Doctor getDoctorById(int id) {
        for (int i = 0; i < size; i++) {
            if (doctorStorages[i].getId() == id) {
                return doctorStorages[i];
            }
        }
        return null;
    }
}