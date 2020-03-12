package com.techstack.monica.assignment2.domain;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentList implements Serializable {
    List<Student> listOfStudents = new ArrayList<>();

    public void addStudent(Student student){
        listOfStudents.add(student);
        //should we make a new list with updated entries?
    }
    public void displayStudent(){
        String studentName = getStudentName();
        System.out.println(Collections.sort(listOfStudents));
    }
    public void deleteStudent(Student student){
        int rollNumber = getRollNumber();
        if(listOfStudents.contains(rollNumber)){
            listOfStudents.remove(student);
        }else{
            System.out.println("Student with entered Roll Number not found");
        }
    }
    public void saveStudent(Student student){
        String file = "//mention the location of file here//";
        ObjectOutputStream os = null;
        try {
            os = new ObjectOutputStream(new FileOutputStream(file));
        os.writeObject(student);
        os.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
