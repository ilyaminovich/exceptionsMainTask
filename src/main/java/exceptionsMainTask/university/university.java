package main.java.exceptionsMainTask.university;

public class university {

    public String nameOfTheUniversity;
    public int amountOfFaculties;
    public int amountOfGroups;
    public float amountOfStudents;
    public float averageScoreInUniversity;

    public university(String nameOfTheUniversity, int amountOfFaculties, int amountOfGroups, float amountOfStudents) {
        this.nameOfTheUniversity = nameOfTheUniversity;
        this.amountOfFaculties = amountOfFaculties;
        this.amountOfGroups = amountOfGroups;
        this.amountOfStudents = amountOfStudents;
        if (this.amountOfFaculties <= 0) {
            throw new IllegalArgumentException("Отсутствуют факультеты в университете" + nameOfTheUniversity);
        }
    }

    public String getNameOfTheUniversity() {
        return nameOfTheUniversity;
    }

    public void setNameOfTheUniversity(String nameOfTheUniversity) {
        this.nameOfTheUniversity = nameOfTheUniversity;
    }

    public int getAmountOfFaculties() {
        return amountOfFaculties;
    }

    public void setAmountOfFaculties(int amountOfFaculties) {
        this.amountOfFaculties = amountOfFaculties;
    }

    public int getAmountOfGroups() {
        return amountOfGroups;
    }

    public void setAmountOfGroups(int amountOfGroups) {
        this.amountOfGroups = amountOfGroups;
    }

    public float getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(float amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }
}
