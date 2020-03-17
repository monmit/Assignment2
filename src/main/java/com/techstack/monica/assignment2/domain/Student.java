package com.techstack.monica.assignment2.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class Student implements Serializable, Comparable<Student> {

    public int age;
    public String address;
    public int rollNumber;
    public List<String> courses;

    public String name;

    public Student(String name, int age, String address, int rollNumber, List<String> courses) {
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

    public List<String> getCourses() { return courses; }

    public void setCourses(List<String> courses) {
        this.courses = courses;
    }

    /*@Override
    public int compareTo(Object o) {
        return 0;
    }*/

    @Override
    public String toString() {
        return name+" "+age+" "+rollNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                rollNumber == student.rollNumber &&
                Objects.equals(address, student.address) &&
                Objects.equals(courses, student.courses) &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, address, rollNumber, courses, name);
    }

    @Override
    public int compareTo(Student o) {
        return Integer.valueOf(this.getRollNumber()).compareTo(o.getRollNumber());
    }
}
