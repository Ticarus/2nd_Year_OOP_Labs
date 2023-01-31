package com.mycompany.lab14;

public class Cat extends Animal{
    public String colorOfEyes;
    
    public Cat(String colorOfEyes, boolean vegetarian, int numberOfLegs){
        super(vegetarian, numberOfLegs);
        this.colorOfEyes = colorOfEyes;
        System.out.println("A Cat is created");
    }
    
    public void makeNoise(){
        System.out.println("Cat Miaowing: Miaooo!");
    }
}
