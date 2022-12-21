package com.mycompany.lab9;

public class Student {
    private int age;
    private String name;
    private static int noOfStudents;
    
    public Student(){
        this.age = 0;
        this.name = "";
    }
    
    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setAge(String name){
        this.name = name;
    }
    
    public static int getNoOfStudents(){
        return noOfStudents;
    }
}
