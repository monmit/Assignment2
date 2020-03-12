package com.techstack.monica.assignment2.service;

import com.techstack.monica.assignment2.domain.Student;
import com.techstack.monica.assignment2.domain.StudentList;

import java.util.Scanner;

public class InputOutputImpl {
    int choice;
    String name = null;
    int age;
    String address = null;
    int rollNumber;
    String[] courses = null;
    StudentList studentlist = new StudentList();

    public void chooseMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. add, 2. display, 3. delete, 4. save, 5. exit");
        System.out.println("please choose any one option");
        choice = scanner.nextInt();
        if(choice == 1){
            askStudentDetails();
            studentlist.addStudent(student);
        } else if (choice == 2){
            studentlist.displayStudent();
        } else if (choice == 3){
            studentlist.deleteStudent();
        } else if (choice == 4){
            studentlist.saveStudent();
        }else if (choice == 5){
            System.out.println("You are exiting. Do you want to save the changes?");
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
    Student student = new Student(name,age, address, rollNumber,courses);
    // how do i send this object to StudenList methods?
}
