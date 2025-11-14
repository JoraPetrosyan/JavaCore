package medicalCenter.model;

import java.util.Objects;

public class Doctor extends Person {

    private String profession;

    public Doctor(int id, String name, String surname, String phoneNumber, String email, String profession) {
        super(id, name, surname, phoneNumber, email);
        this.profession = profession;
    }

    public Doctor(String profession, String surname, String phoneNumber, String email, String s) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Doctor doctor1 = (Doctor) o;
        return Objects.equals(profession, doctor1.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), profession);
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "profession='" + profession + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
