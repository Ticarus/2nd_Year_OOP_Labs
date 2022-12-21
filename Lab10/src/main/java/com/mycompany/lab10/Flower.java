package com.mycompany.lab10;

public class Flower {
    private String color;
    private String name;
    private double unitPrice;
    
    public Flower(String color, String name, double unitPrice){
        this.color = color;
        this.name = name;
        this.unitPrice = unitPrice;       
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public double getUnitPrice(){
        return this.unitPrice;
    }
    
    public void setUnitPrice(double unitPrice){
        this.unitPrice = unitPrice;
    }
}
