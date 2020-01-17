package main.java.exceptionsMainTask.university.faculties.mmfFaculty.group.mmfStudents;

import main.java.exceptionsMainTask.university.faculties.Students;

public class MmfStudents extends Students {

    public int philosophy;
    public int mathematicalAnalysis;
    public int programming;

    public MmfStudents(String fullName, int age, int numberOfGroup,int amountOfSubjects, int philosophy, int mathematicalAnalysis, int programming) {
        super(fullName, age, numberOfGroup, amountOfSubjects);
        this.philosophy = philosophy;
        this.mathematicalAnalysis = mathematicalAnalysis;
        this. programming = programming;
        if (mathematicalAnalysis < 0 || philosophy < 0 || programming < 0) {
            throw new IllegalArgumentException("Оценка не может быть ниже 0");
        }
        if (mathematicalAnalysis > 10 || philosophy > 10 || programming > 10) {
            throw new IllegalArgumentException("Оценка не может быть выше 10");
        }
    }

    public int getPhilosophy() {
        return philosophy;
    }

    public void setPhilosophy(int philosophy) {
        this.philosophy = philosophy;
    }

    public int getMathematicalAnalysis() {
        return mathematicalAnalysis;
    }

    public void setMathematicalAnalysis(int mathematicalAnalysis) {
        this.mathematicalAnalysis = mathematicalAnalysis;
    }

    public int getProgramming() {
        return programming;
    }

    public void setProgramming(int programming) {
        this.programming = programming;
    }
}