package main.java.exceptionsMainTask.university.faculties;

public class Faculty {
    public String nameOfFaculty;
    public int numberOfGroups;
    public float amountOfStudentsInFaculty;

    public Faculty(String nameOfFaculty, int numberOfGroups, float amountOfStudentsInFaculty) {
        this.nameOfFaculty = nameOfFaculty;
        this.numberOfGroups = numberOfGroups;
        this.amountOfStudentsInFaculty = amountOfStudentsInFaculty;
        if (numberOfGroups <= 0) {
            throw new IllegalArgumentException("Отсутствуют группы на факультете" + this.nameOfFaculty);
        }
    }

    public String getNameOfFaculty() {
        return nameOfFaculty;
    }

    public void setNameOfFaculty(String nameOfFaculty) {
        this.nameOfFaculty = nameOfFaculty;
    }

    public int getNumberOfGroups() {
        return numberOfGroups;
    }

    public void setNumberOfGroups(int numberOfGroups) {
        this.numberOfGroups = numberOfGroups;
    }

    public float getAmountOfStudentsInFaculty() {
        return amountOfStudentsInFaculty;
    }

    public void setAmountOfStudentsInFaculty(float amountOfStudentsInFaculty) {
        this.amountOfStudentsInFaculty = amountOfStudentsInFaculty;
    }
}
