package com.mycompany.lab12;

public class Employee extends Person{
    public Employee(String name, int age){
        super(name, age);
    }
    
    public String toString(){
        return super.toString();
    }
    
    public boolean equals(Object obj){
        if((obj instanceof Employee) == false){
            return false;
        }
        
        Employee other = (Employee) obj;
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
    }
}
