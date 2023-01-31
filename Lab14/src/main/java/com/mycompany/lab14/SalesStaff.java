package com.mycompany.lab14;

public class SalesStaff extends Staff{
    public double salesAmount;
    public double bonusRate;
    
    public SalesStaff(String name, double salesAmount, double bonusRate){
        super(name,500.0);  //fixed salary is 500
        this.salesAmount = salesAmount;
        this.bonusRate = bonusRate;
    }
    
    public void setSalesAmount(double salesAmount){
        if(salesAmount >= 0){
            this.salesAmount = salesAmount;
        }
        else{
            System.out.println("it should be positive");
        }
    }
    
    public double displaySalary(){
        System.out.print("Sales Staff Salary: ");
        return super.getSalary() + (this.salesAmount * (1 + bonusRate));
    }
}
