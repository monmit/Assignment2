package com.techstack.monica.assignment2.domain;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentManager implements Serializable {
    private List<Student> listOfStudents = new ArrayList<>();
    private boolean unSavedChanges = false;

    public StudentManager() throws IOException, ClassNotFoundException {
        try {
            FileInputStream fileIn = new FileInputStream("/Users/monica/Desktop/test.txt");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            List<Student> list = (List<Student>) objectIn.readObject();
            listOfStudents.addAll(list);
        } catch (FileNotFoundException e) {
            //nothing to do
        }
    }
    public void addStudent(Student student){
        listOfStudents.add(student);
        unSavedChanges = true;
    }
    public void displayAllStudents(SortingOrder sortingChoice){
        if(sortingChoice == SortingOrder.DESCENDING){
            Collections.sort(listOfStudents, Collections.reverseOrder());
        } else {
            Collections.sort(listOfStudents);
        }
        System.out.println(listOfStudents.toString());
    }
    public void deleteStudent(int rollNumber) {
        Student toBeDeletedStudent = null;
        for (Student student : listOfStudents) {
            int testRollNumber = student.getRollNumber();
            if (testRollNumber == rollNumber) {
                toBeDeletedStudent = student;
            }
        }
        if(toBeDeletedStudent == null) {
            System.out.println("Student with entered Roll Number not found");
        } else {
            listOfStudents.remove(toBeDeletedStudent);
            unSavedChanges = true;
        }
    }

    public void saveStudentsToFile() throws IOException {
        FileOutputStream fileOut = new FileOutputStream(new File("/Users/monica/Desktop/test.txt"));
        ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
        objectOut.writeObject(listOfStudents);
        objectOut.close();
        fileOut.close();
        unSavedChanges = false;
    }

    public boolean isUnSavedChanges() {
        return unSavedChanges;
    }
}
