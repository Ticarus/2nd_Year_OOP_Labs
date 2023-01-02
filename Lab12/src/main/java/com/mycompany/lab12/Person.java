package com.mycompany.lab12;

public class Person {
    protected String name;
    private int age;
    
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public String toString(){
        return "Name : " + name + " Age : " + age;
    }
    
    public boolean equals(Object obj){
        if((obj instanceof Person) == false){
            return false;
        }
        
        Person other = (Person) obj;
        return this.name.equals(other.getName()) && this.age == other.getAge();
    }
}
