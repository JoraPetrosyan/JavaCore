package medicalCenter.util;
import medicalCenter.storage.DoctorStorage;
import medicalCenter.storage.PatientStorage;

import java.io.*;

public class FileUtil {


    private static final String DOCTOR_DATA_FILE = "C:\\Users\\USER\\IdeaProjects\\JavaCore\\src\\medicalCenter\\Data\\doctorData.data ";
    private static final String PATIENT_DATA_FILE = "C:\\Users\\USER\\IdeaProjects\\JavaCore\\src\\medicalCenter\\Data\\patientData.data";

    public static void serializeDoctorData(DoctorStorage doctorStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(DOCTOR_DATA_FILE))) {
            outputStream.writeObject(doctorStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Doctor Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Doctor Data" + e);
        }
    }

    public static void serializePatientData(PatientStorage patientStorage) {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(PATIENT_DATA_FILE))) {
            outputStream.writeObject(patientStorage);
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Patient Data" + e);
        } catch (IOException e) {
            System.out.println("Failed to Serialize Patient Data" + e);
        }
    }

    public static DoctorStorage deserializeDoctorStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(DOCTOR_DATA_FILE))) {
            Object object = objectInputStream.readObject();
            if (object instanceof DoctorStorage doctorStorage) {
                return doctorStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Doctor Data" + e);
        } catch (IOException e) {
            System.out.println("File nor found for Doctor Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new DoctorStorage();
    }

    public static PatientStorage deserializePatientStorage() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(PATIENT_DATA_FILE))) {
            Object object = objectInputStream.readObject();
            if (object instanceof PatientStorage patientStorage) {
                return patientStorage;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File nor found for Patient Data" + e);
        } catch (IOException e) {
            System.out.println("File nor found for Patient Data" + e);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return new PatientStorage();
    }
}
