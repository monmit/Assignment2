package com.techstack.monica.assignment2.service;

import com.techstack.monica.assignment2.domain.Student;
import com.techstack.monica.assignment2.domain.StudentList;

import java.util.Scanner;

public class InputOutputimpl {
    //int[] options = {1,2,3,4,5};
    int choice;
    String name;
    int age;
    String address;
    int rollNumber;
    String[] courses;
    StudentList studentlist = new StudentList();

    public void chooseMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. add, 2. display, 3. delete, 4. save, 5. exit");
        System.out.println("please choose any one option");
        choice = scanner.nextInt();
        if(choice == 1){
            askStudentDetails();
            studentlist.addStudent();
        } else if (choice == 2){
            studentlist.displayStudent();
        } else if (choice == 3){
            studentlist.deleteStudent();
        } else if (choice == 4){
            studentlist.saveStudent();
        }else if (choice == 5){
            System.out.println("Exit");
        }

    }
        public void askStudentDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the fullName below:");
        name = scanner.next();
        System.out.println("Please enter the Age below:");
        age = scanner.nextInt();
            // How do is include a check for non integer values?
        System.out.println("Please enter the Address below:");
        address = scanner.next();
        System.out.println("Please enter the RollNumber below:");
        rollNumber = scanner.nextInt();
            // same here, How do is include a check for non integer values?
        System.out.println("Please enter atleast 4 courses below");
        askStudentCourses();
        // how do i make this input as a student object?
     }

    public void askStudentCourses(){
        Scanner scanner = new Scanner(System.in);
        while(courses.length<4){
            String allCourses = scanner.next();
            courses = allCourses.trim().split(",");
        }

    }
}
