package main.java.exceptionsMainTask.university.faculties;

public class Students {

    public String fullName;
    public int age;
    public int numberOfGroup;
    public int amountOfSubjects;

    public Students(String fullName, int age, int numberOfGroup, int amountOfSubjects) {
        this.fullName = fullName;
        this.age = age;
        this.numberOfGroup = numberOfGroup;
        this.amountOfSubjects = amountOfSubjects;
        if (amountOfSubjects <= 0) {
            throw new IllegalArgumentException("Отсутствуют предметы у студента");
        }
    }

    public Students() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumberOfGroup() {
        return numberOfGroup;
    }

    public void setNumberOfGroup(int numberOfGroup) {
        this.numberOfGroup = numberOfGroup;
    }

    public int getAmountOfSubjects() {
        return amountOfSubjects;
    }

    public void setAmountOfSubjects(int amountOfSubjects) {
        this.amountOfSubjects = amountOfSubjects;
    }
}
