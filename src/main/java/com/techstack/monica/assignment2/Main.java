package com.techstack.monica.assignment2;

import com.techstack.monica.assignment2.domain.Student;
import com.techstack.monica.assignment2.domain.StudentList;
import com.techstack.monica.assignment2.service.InputOutputimpl;

public class Main {

    public static void main(String[] args) {
        InputOutputimpl userInput = new InputOutputimpl();
        Student student = new Student();
        StudentList studentList = new StudentList();
        userInput.chooseMethod();

    }

}
