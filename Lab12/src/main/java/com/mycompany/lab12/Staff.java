package com.mycompany.lab12;

public class Staff extends Employee{
    public Staff(String name, int age){
        super(name, age);
    }
    
    public String toString(){
        return super.toString();
    }
    
    public boolean equals(Object obj){
        if((obj instanceof Staff) == false){
            return false;
        }
        
        Staff other = (Staff) obj;
        
        return this.getName().equals(other.getName()) && this.getAge() == other.getAge();
    }
}
