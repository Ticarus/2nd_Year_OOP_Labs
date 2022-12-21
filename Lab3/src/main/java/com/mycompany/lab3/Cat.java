package com.mycompany.lab3;

public class Cat {
    private int x;
    private double direction;
    private String name;
    
    public Cat(){
        this(0, 90.0, "A");
    }
    
    public Cat(int x, double direction, String name){    
        this.x = x;
        this.direction = direction;
        this.name = name;
    }
    
    public int getX(){
        return this.x;
    }
    
    public void setX(int x){
        this.x = x;
    }
    
    public double getDirection(){
        return this.direction;
    }
    
    public void setDirection(double direction){
        this.direction = direction;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void move(){
        this.x += 10;
    }
    
    public void move2(int a){
        this.x += a;
    }
    
    public void turn(double angle){
        direction += angle;
    }
    
    public void status(){
        System.out.println("Name : " + this.name + "\nX : " + this.x + "\nDirection : " + this.direction);
    }
}
