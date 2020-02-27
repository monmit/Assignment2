package com.techstack.monica.assignment2.service;

import com.techstack.monica.assignment2.domain.Student;
import com.techstack.monica.assignment2.domain.StudentList;

import java.util.Scanner;

public class InputOutputimpl extends StudentList {
    Scanner scanner = new Scanner(System.in);
    int[] options = {1,2,3,4,5};
    int choice;

    public void chooseMethod(){
        System.out.println("1. add, 2. display, 3. delete, 4. save, 5. exit");
        System.out.println("please choose any one option");
        choice = scanner.nextInt();
        if(choice == 1){

        }

        }

    public void askStudentDetails(Student student){
        String name = scanner.next();
        student.setName(name);
        int age = scanner.nextInt();
        student.setAge(age);
        String address = scanner.next();
        student.setAddress(address);
        int rollNumber = scanner.nextInt();
        student.setRollNumber(rollNumber);
        String courses = scanner.next();
        student.setCourses(courses);

    }

    public void askStudentCourses(Student student){

    }
}
