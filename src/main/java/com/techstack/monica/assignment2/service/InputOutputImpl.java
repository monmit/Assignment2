package com.techstack.monica.assignment2.service;

import com.techstack.monica.assignment2.domain.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputOutputImpl {

    public int chooseMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. add, 2. display, 3. delete, 4. save, 5. exit");
        System.out.println("please choose any one option");
        int choice = scanner.nextInt();
        return choice;
    }

    public Student getStudentDetails(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the fullName below:");
        String name = scanner.next();
        Integer age = getAgeFromUser(scanner);
        System.out.println("Please enter the Address below:");
        String address = scanner.next();
        Integer rollNumber = getRollNumberFromUser(scanner);
        System.out.println("There are 6 courses: A, B, C, D, E, F");
        System.out.println("Please enter at least 4 courses below separated by comma");
        List<String> courses = new ArrayList<>();
        courses.addAll(getStudentCourses());
        Student student = new Student(name,age, address, rollNumber,courses);
        return student;
    }

    private Integer getRollNumberFromUser(Scanner scanner) {
        Integer rollNumber = 0;
        System.out.println("Please enter the RollNumber below:");
        rollNumber = scanner.nextInt();
        while(rollNumber < 1){
            System.out.println("Incorrect Roll Number. Roll Number should be greater than 0, Enter Roll Number again:");
            rollNumber = scanner.nextInt();
        }
        return rollNumber;
    }

    private Integer getAgeFromUser(Scanner scanner) {
        Integer age = 0;
        System.out.println("Please enter the Age below:");
        age = scanner.nextInt();
        while(age < 1){
            System.out.println("Incorrect Age. Age should be greater than 0, Enter Age again:");
            age = scanner.nextInt();
        }
        return age;
    }

    private List<String> getStudentCourses(){
        List<String> courses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(courses.size() <4){
            String allCourses = scanner.next();
            courses = Arrays.asList(allCourses.trim().split(","));
        }
        return courses;
    }

    public int getSortingChoice(){
        int sortingChoice = 2;
        return sortingChoice;

    }

    public boolean getUserChoiceToSaveData(){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (input.trim().equalsIgnoreCase("n")) {
            return false;
        } else {
            return true;

        }
    }

}
