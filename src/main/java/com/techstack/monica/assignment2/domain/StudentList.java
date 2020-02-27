package com.techstack.monica.assignment2.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentList {

    public void addStudent(Student student){
        List<Student> listOfStudents = new ArrayList<>();
        listOfStudents.add(student);
    }

}
