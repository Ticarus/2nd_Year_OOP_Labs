package com.mycompany.lab9;

public class Dog {
    private int loc;
    private String name;
    private String ownerName;
    private int age;
    private static int count;
    
    public Dog(String ownerName){
        this.ownerName = ownerName;
    }
    
    public Dog(int loc, String name, String ownerName, int age){
        this.loc = loc;
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
    }
    
    public int getLoc(){
        return this.loc;
    }
    
    public void setLoc(int loc){
        this.loc = loc;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getOwnerName(){
        return this.ownerName;
    }
    
    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }
    
    public int getAge(){
        return this.age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public int getCount(){
       return count;
    }
    
    public String toString(){
        return ("Name : " + this.name + "\nAge : " + this.age + "\nOwner Name : " + this.ownerName);
    }
    
    public boolean equals(Dog d){
        return (this.name.equals(d.name) && this.age == d.age);
    }
    
    public void move(int nloc){
        loc += nloc;
    }
}
