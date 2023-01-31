package com.mycompany.lab14;

public class Animal {
    protected boolean vegetarian;
    protected int numberOfLegs;
    
    public Animal(){
        this.vegetarian = false;
        this.numberOfLegs = 2;
        System.out.println("An Animal is created");
    }
    
    public Animal(boolean vegetarian, int numberOfLegs){
        this.vegetarian = vegetarian;
        this.numberOfLegs = numberOfLegs;
        System.out.println("An Animal is created");
    }
    
    public boolean getVegetarian(){
        return this.vegetarian;
    }
    
    public void setVegetarian(boolean vegetarian){
        this.vegetarian = vegetarian;
    }
    
    public int getNumberOfLegs(){
        return this.numberOfLegs;
    }
    
    public void setNumberOfLegs(int numberOfLegs){
        this.numberOfLegs = numberOfLegs;
    }
    
    public void makeNoise(){
        System.out.println("Animal making noise");
    }
}
