package com.techstack.monica.assignment2.domain;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    List<Student> listOfStudents = new ArrayList<>();

    public void addStudent(Student student){
        listOfStudents.add(student);
    }
    public void displayStudent(Student student){
        System.out.println(listOfStudents.get());
    }
    public void deleteStudent(Student student){
        listOfStudents.remove();
    }
    public void saveStudent(){

    }
}
