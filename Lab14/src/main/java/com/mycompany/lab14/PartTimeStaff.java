package com.mycompany.lab14;

public class PartTimeStaff extends Staff{
    public int workingHour;
    public double hourlyFee;
    
    public PartTimeStaff(String name, int workingHour, double hourlyFee){
        super(name,0.0);  //fixed salary is 0
        this.workingHour = workingHour;
        this.hourlyFee = hourlyFee;
    }
    
    public void setWorkingHour(int workingHour){
        if(workingHour >= 0){
            this.workingHour = workingHour;
        }
        else{
            System.out.println("it should be positive");
        }
       
    }
    
    public double displaySalary(){
        System.out.print("Part-Time Staff Salary: ");
        return hourlyFee * workingHour;
    }
}
