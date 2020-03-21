package com.techstack.monica.assignment2.service;

import com.techstack.monica.assignment2.domain.Course;
import com.techstack.monica.assignment2.domain.SortingOrder;
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
        Integer age = getAgeFromUser();
        System.out.println("Please enter the Address below:");
        String address = scanner.next();
        Integer rollNumber = getRollNumberFromUser("Please enter the RollNumber below:");
        System.out.println("There are 6 courses: A, B, C, D, E, F");
        System.out.println("Please enter at least 4 courses below separated by comma");
        List<Course> courses = getStudentCourses();
        Student student = new Student(name,age, address, rollNumber,courses);
        return student;
    }

    public Integer getRollNumberFromUser(String inputQuestion) {
        Scanner scanner = new Scanner(System.in);
        Integer rollNumber = 0;
        System.out.println(inputQuestion);
        rollNumber = scanner.nextInt();
        while(rollNumber < 1){
            System.out.println("Incorrect Roll Number. Roll Number should be greater than 0, Enter Roll Number again:");
            rollNumber = scanner.nextInt();
        }
        return rollNumber;
    }

    private Integer getAgeFromUser() {
        Scanner scanner = new Scanner(System.in);
        Integer age = 0;
        System.out.println("Please enter the Age below:");
        age = scanner.nextInt();
        while(age < 1){
            System.out.println("Incorrect Age. Age should be greater than 0, Enter Age again:");
            age = scanner.nextInt();
        }
        return age;
    }

    private List<Course> getStudentCourses(){
        List<Course> courses = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(courses.size() < 4) {
            String allCourses = scanner.next();
            List<String> courseStrings = Arrays.asList(allCourses.trim().split(","));
            boolean invalid = false;
            for (String c : courseStrings) {
                try {
                    Course course = Course.valueOf(c);
                    courses.add(course);
                } catch (Exception e) {
                    System.out.println("wrong course value given");
                    invalid = true;
                    break;
                }
            }

            if(invalid) {
                System.out.println("Invalid courses. Enter Again");
                courses.clear();
            }
        }
        return courses;
    }

    public SortingOrder getSortingChoice(){
        Scanner scanner = new Scanner(System.in);
        int sortingChoice = scanner.nextInt();
        SortingOrder order = SortingOrder.DESCENDING;;
        if(sortingChoice == 1){
            order = SortingOrder.ACSENDING;
        }
        return order;
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
