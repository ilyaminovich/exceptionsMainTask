package main.java.exceptionsMainTask.university.faculties.lawFaculty.group.lawStudents;

import main.java.exceptionsMainTask.university.faculties.Students;

public class LawStudents extends Students {

    public float constitutionalLaw;
    public int philosophy;
    public int labourLaw;

    public LawStudents(String fullName, int age, int numberOfGroup, int amountOfSubjects, float constitutionalLaw, int philosophy, int labourLaw) {
        super(fullName, age, numberOfGroup, amountOfSubjects);
        this.constitutionalLaw = constitutionalLaw;
        this.philosophy = philosophy;
        this.labourLaw = labourLaw;
        if (constitutionalLaw < 0 || philosophy < 0 || labourLaw < 0) {
            throw new IllegalArgumentException("Оценка не может быть ниже 0");
        }
        if (constitutionalLaw > 10 || philosophy > 10 || labourLaw > 10) {
            throw new IllegalArgumentException("Оценка не может быть выше 10");
        }
    }

    public LawStudents() {
        super();
    }

    public float getConstitutionalLaw() {
        return constitutionalLaw;
    }

    public void setConstitutionalLaw(float constitutionalLaw) {
        this.constitutionalLaw = constitutionalLaw;
    }

    public int getPhilosophy() {
        return philosophy;
    }

    public void setPhilosophy(int philosophy) {
        this.philosophy = philosophy;
    }

    public int getLabourLaw() {
        return labourLaw;
    }

    public void setLabourLaw(int labourLaw) {
        this.labourLaw = labourLaw;
    }

}
