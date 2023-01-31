package com.mycompany.lab14;

public class Bird extends Animal{
    public double lengthOfTail;
    
    public Bird(double lengthOfTail, boolean vegetarian, int numberOfLegs){
        super(vegetarian, numberOfLegs);
        this.lengthOfTail = lengthOfTail;
        System.out.println("A Bird is created");
    }
    
    public void makeNoise(){
        System.out.println("Bird Singing: CikCiiik");
    }
}
