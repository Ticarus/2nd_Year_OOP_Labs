package com.mycompany.lab6;

import java.util.Date;

public class Student {
    private String name;
    private String address;
    private String[] courses;
    private int[] grades;   //Valid range [0, 100]
    private static final int MAX_COURSES = 30;  //Maximum
    private int numCourses;    //Number of courses taken so far
    private static int studentCounter = 1000;
    public final int stuId;
    public Date dateRegistered;
    
    public Student(){
        this("", "");
    }
    
    public Student(String name, String address){
        this.name = name;
        this.address = address;
        courses = new String[MAX_COURSES];  //Allocate arrays
        grades = new int[MAX_COURSES];
        numCourses = 0;
        this.stuId = ++studentCounter;
        this.dateRegistered = new Date(System.currentTimeMillis());
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setAddress(String address){
        this.address = address;
    }
    
    public String toString(){
        return "Name : " + name + " ID : " + stuId + " Address : " + address + " Registration Date : " + dateRegistered;
    }
    
    public void addCourseGrade(String course, int grade){
        courses[numCourses] = course;
        grades[numCourses] = grade;
        ++numCourses;
    }
    
    public void printGrades(){
        System.out.print(name);
        for(int i = 0 ; i < numCourses ; ++i){
            System.out.print(" " + courses[i] + " : " + grades[i]);
        }
        System.out.println();
    }
    
    public double getAverageGrade(){
        int sum = 0;
        for(int i = 0 ; i < numCourses ; ++i){
            sum += grades[i];
        }
        return (double) sum / numCourses; 
    }
}
