package main.java.exceptionsMainTask.university.faculties;

public class Group {
    int numberOfGroup;
    float amountOfStudents;

    public Group(int numberOfGroup, float amountOfStudents) {
        this.numberOfGroup = numberOfGroup;
        this.amountOfStudents = amountOfStudents;
        if (amountOfStudents <= 0) {
            throw new IllegalArgumentException("Отсутствуют студенты в группе " + this.numberOfGroup);
        }
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public float getAmountOfStudents() {
        return amountOfStudents;
    }

    public void setAmountOfStudents(float amountOfStudents) {
        this.amountOfStudents = amountOfStudents;
    }
}
