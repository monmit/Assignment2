package com.techstack.monica.assignment2;

import com.techstack.monica.assignment2.domain.Student;
import com.techstack.monica.assignment2.domain.StudentManager;
import com.techstack.monica.assignment2.service.InputOutputImpl;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        StudentManager studentManager = new StudentManager();
        InputOutputImpl input = new InputOutputImpl();
        int choice = 0;
        while(choice != 5) {
            choice = input.chooseMethod();
            if(choice == 1){
                Student student = input.getStudentDetails();
                studentManager.addStudent(student);
            } else if (choice == 2) {
                studentManager.displayAllStudents(input.getSortingChoice());
            } else if (choice == 3) {
                studentManager.deleteStudent(input.getRollNumberFromUser("Please enter the RollNumber of student to be deleted:"));
            } else if (choice == 4) {
                studentManager.saveStudentsToFile();
            } else if (choice == 5) {
                if(studentManager.isUnSavedChanges()) {
                    System.out.println("you have some unsaved changes. Do you want to save them before exiting");
                    boolean yes = input.getUserChoiceToSaveData();
                    if(yes){
                        studentManager.saveStudentsToFile();
                    }
                }
            }
        }
        System.out.println("Adios Amigos");
    }

}
