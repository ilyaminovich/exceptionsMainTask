package main.java.exceptionsMainTask.university;

import main.java.exceptionsMainTask.university.faculties.lawFaculty.group.LawGroup;
import main.java.exceptionsMainTask.university.faculties.lawFaculty.group.lawStudents.LawStudents;
import main.java.exceptionsMainTask.university.faculties.lawFaculty.LawFaculty;
import main.java.exceptionsMainTask.university.faculties.mmfFaculty.group.mmfStudents.MmfStudents;
import main.java.exceptionsMainTask.university.faculties.mmfFaculty.MmfFaculty;
import main.java.exceptionsMainTask.university.faculties.mmfFaculty.group.MmfGroup;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class StudentsRun {

    public static void main(String[] args) {

        university BSU = new university("BSU", 2, 4, 10);

        LawFaculty lawFaculty = new LawFaculty("Law-faculty", 2, 5);
        MmfFaculty mmfFaculty = new MmfFaculty("Mmf-faculty",2,5);

        List<LawGroup> lawGroups = new ArrayList<>();
        LawGroup firstLawGroup = new LawGroup(1,3);
        LawGroup secondLawGroup = new LawGroup(2,2);
        lawGroups.add(firstLawGroup);
        lawGroups.add(secondLawGroup);

        List<MmfGroup> mmfGroups = new ArrayList<>();
        MmfGroup firstMmfGroup = new MmfGroup(1,3);
        MmfGroup secondMmfGroup = new MmfGroup(2,2);
        mmfGroups.add(firstMmfGroup);
        mmfGroups.add(secondMmfGroup);

        List<LawStudents> lawStudents = new ArrayList<>();
        LawStudents firstLawStudent = new LawStudents("Minovich", 20, 1, 3,5,5, 5);
        LawStudents secondLawStudent = new LawStudents("Borushko", 21, 1, 3, 6,6,8);
        LawStudents thirdLawStudent = new LawStudents("Rozanov", 20, 1, 3, 8, 4,5);
        LawStudents fourthLawStudent = new LawStudents("Popov", 21,2, 3,4,4,4);
        LawStudents fifthLawStudent = new LawStudents("Solopov", 20, 2, 3, 5,6,8);

        lawStudents.add(firstLawStudent);
        lawStudents.add(secondLawStudent);
        lawStudents.add(thirdLawStudent);
        lawStudents.add(fourthLawStudent);
        lawStudents.add(fifthLawStudent);

        List<MmfStudents> mmfStudents = new ArrayList<>();
        MmfStudents firstMmfStudent = new MmfStudents("Lomov", 21,1, 3,5,6,8);
        MmfStudents secondMmfStudent = new MmfStudents("Homov", 21,1, 3,7,7,6);
        MmfStudents thirdMmfStudent = new MmfStudents("Tomov", 21,1, 3,7,4,8);
        MmfStudents fourthMmfStudent = new MmfStudents("Romov", 21,2, 3,5,6,4);
        MmfStudents fifthMmfStudent = new MmfStudents("Oblomov", 21,2, 3,8,6,7);

        mmfStudents.add(firstMmfStudent);
        mmfStudents.add(secondMmfStudent);
        mmfStudents.add(thirdMmfStudent);
        mmfStudents.add(fourthMmfStudent);
        mmfStudents.add(fifthMmfStudent);

        //Посчитать средний балл по всем предметам студента
        double averageScore = 0;
        Field[] field = LawStudents.class.getDeclaredFields();
        averageScore = (fifthLawStudent.constitutionalLaw + firstLawStudent.philosophy + firstLawStudent.labourLaw) / field.length;
        System.out.println("средний балл по всем предметам студента " + firstLawStudent.fullName + " = " + averageScore);

        //Посчитать средний балл по конкретному предмету в конкретной группе
            for (int i = 0; i < lawStudents.size(); i++) {
            if (lawStudents.get(i).numberOfGroup == secondLawGroup.getNumberOfGroup()) {
                secondLawGroup.averageScoreInLawGroup += lawStudents.get(i).constitutionalLaw / secondLawGroup.getAmountOfStudents();
            }
        }
        System.out.println("средний балл по конституционному праву во второй группе: " + secondLawGroup.averageScoreInLawGroup );
        //Посчитать средний балл по конкретному предмету на конкретном факультете
        for (int i = 0; i < lawFaculty.amountOfStudentsInFaculty; i++) {
                lawFaculty.averageScoreInLawFaculty += lawStudents.get(i).constitutionalLaw / lawFaculty.amountOfStudentsInFaculty;
        }
        System.out.println("средний балл по конституционному праву на юридическом факультете: " + lawFaculty.averageScoreInLawFaculty);

        //Посчитать средний балл по предмету для всего университета
        for (int i = 0; i < lawStudents.size(); i++) {
            BSU.averageScoreInUniversity += lawStudents.get(i).philosophy;
        }
        for (int o = 0; o < mmfStudents.size(); o++) {
            BSU.averageScoreInUniversity += mmfStudents.get(o).philosophy;
        }
        BSU.averageScoreInUniversity /= BSU.amountOfStudents;
        System.out.println("средний балл по философии для всего университета: " + BSU.averageScoreInUniversity);
   }
}