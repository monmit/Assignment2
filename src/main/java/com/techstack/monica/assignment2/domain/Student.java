package com.techstack.monica.assignment2.domain;

public class Student {

    public int age;
    public String address;
    public int rollNumber;
    public String courses;

    public String name;

    public Student( String name, int age, String address, int rollNumber, String courses) {
        this.age = age;
        this.address = address;
        this.rollNumber = rollNumber;
        this.courses = courses;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getCourses() { return courses; }

    public void setCourses(String courses) {
        this.courses = courses;
    }

}
