package com.mycompany.lab3;

public class Employee {
    public String name;
    public double salary;
    public double hours;
    
    public Employee(){
        name = "";
        salary = 0;
        hours = 0;
    }
    
    public Employee(String n, double s, double h){
        name = n;
        salary = s;
        hours = h;
    }
    
    public void addBonus(){
        if(salary < 600){
            salary += 15;
        }
    }
    
    public void addWork(){
        if(hours > 8){
            salary += 10;
        }
    }
    
    public void printSalary(){
        System.out.println("Salary : " + salary);
    }
}
