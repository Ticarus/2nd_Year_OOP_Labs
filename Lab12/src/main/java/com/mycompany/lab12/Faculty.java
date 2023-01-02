package com.mycompany.lab12;

public class Faculty extends Employee{
    private String department;
    
    public Faculty(String name, int age){
        super(name, age);
        this.department = "";
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
        if((obj instanceof Faculty) == false){
            return false;
        }
        
        Faculty other = (Faculty) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge() && this.department.equals(other.getDepartment());
    }
}
