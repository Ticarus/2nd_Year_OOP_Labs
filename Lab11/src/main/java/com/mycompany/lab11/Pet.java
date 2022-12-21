package com.mycompany.lab11;

public class Pet {
    protected String name;
    protected String owner;
    protected int age;
    protected boolean isMale;
    
    public Pet(String name, int age, boolean isMale){
        this.name = name;
        this.age = age;
        this.isMale = isMale;
        this.owner = "None";
    }
    
    public Pet(int age, boolean isMale){
        this.age = age;
        this.isMale = isMale;
        this.owner = "None";
        this.name = "none";
    }
    
    public String getName(){
        return this.name;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public boolean getIsMale(){
        return this.isMale;
    }
    
    public void beAdopted(String owner, String name){
        this.owner = owner;
        this.name = name;
    }
    
    protected static boolean isNullOrEmpty(String s){
        return (s.length()<1 ? true : false);
    }
    
    protected boolean hasOwner(){
        return (this.owner != "None" ? true : false);
    }
    
    public void changeName(String name){
        this.name = name;
    }
}
