package com.anil;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    public static List<Student> loadStudentData() {
        List<Student> llStudentList = new ArrayList<>();
        llStudentList.add(new Student("Anil", "Tadipatri,RayalaSeema"));
        llStudentList.add(new Student("Aswartha", "Jammalamadugu,RayalaSeema"));
        llStudentList.add(new Student("Jayachandra", "Chittor,RayalaSeema"));
        llStudentList.add(new Student("Mahendra", "Kadapa,RayalaSeema"));
        llStudentList.add(new Student("Kishore", "Rajampeta,RayalaSeema"));
        llStudentList.add(new Student("Rakesh", "Nandyala,RayalaSeema"));
        llStudentList.add(new Student("Suresh", "Kurnool,RayalaSeema"));
        llStudentList.add(new Student("Sudhakar", "Ananthapur,RayalaSeema"));
        llStudentList.add(new Student("Prasad", "Ananthapur,RayalaSeema"));
        return llStudentList;
    }
}
