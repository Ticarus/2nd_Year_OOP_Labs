package com.mycompany.lab11;

public class Dog extends Pet{
    private String color;
    private String breed;
    
    public Dog(String name, int age, boolean isMale, String color, String breed){
        super(name, age, isMale);
        this.color = color;
        this.breed = breed;
    }
    
    public Dog(int age, boolean isMale, String color, String breed){
        super(age, isMale);
        this.color = color;
        this.breed = breed;
    }
    
    public void speak(){
        System.out.println("woof");
    }
    
    public String getColor(){
        return this.color;
    }
    
    public String getBreed(){
        return this.breed;
    }
    
    public void setBreed(String breed){
        this.breed = breed;
    }
    
    public int getHumanAge(){
        return (7 * super.age);
    }
}
