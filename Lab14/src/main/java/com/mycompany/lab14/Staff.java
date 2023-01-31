package com.mycompany.lab14;

public class Staff {
    protected String name;
    private String id;
    private double fixedSalary;
    
    public Staff(String name, double fixedSalary){
        this.name = name;
        this.fixedSalary = fixedSalary;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public String getId(){
        return this.id;
    }
    
    public void setSalary(double salary){
        fixedSalary = salary;
    }
    
    public double getSalary(){
        return fixedSalary;
    }
    
    public double displaySalary(){
        System.out.print("Staff Salary: ");
        return fixedSalary;
    }
}
