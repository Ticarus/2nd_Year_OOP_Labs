package com.mycompany.lab12;

public class Student extends Person{
    protected String department;
    
    public Student(String name, int age, String department){
        super(name, age);
        this.department = department;
    }
    
    public String getDepartment(){
        return department;
    }
    
    public void setDepartment(String department){
        this.department = department;
    }
    
    public String toString(){
        return super.toString() + " Department : " + department;
    }
    
    public boolean equals(Object obj){
        if((obj instanceof Student) == false){
            return false;
        }
        
        Student other = (Student) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.department.equals(other.getDepartment());
    }
}
