package com.mycompany.lab1;

public class Student {
    private String name;
    private int age;
    private boolean isJunior;
    private char gender;
    
    public Student(){
        name = "";
        age = 0;
        isJunior = false;
        gender = 'm';
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public boolean getIsJunior(){
        return this.isJunior;
    }
    
    public void setIsJunior(boolean isJunior){
        this.isJunior = isJunior;
    }
    
    public char getGender(){
        return this.gender;
    }
    
    public void setGender(char gender){
        this.gender = gender;
    }
    
    public void info(){
        System.out.println("Student : " + name + "\nAge : " + age + "\nGender : " + gender + "\nJunior : " + isJunior);
    }
}
