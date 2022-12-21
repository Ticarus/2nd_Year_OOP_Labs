package com.mycompany.lab11;

public class Circle extends GeometricObject{
    private double radius;
    
    public Circle(){
        super();
    }
    
    public Circle(double radius){
        super();
        this.radius = radius;
    }
    
    public Circle(double radius, String color, boolean filled){
        super(color, filled);
        this.radius = radius;
    }
    
    public double getRadius(){
        return this.radius;
    }
    
    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public double getArea(){
        return (Math.PI * (this.radius * this.radius));
    }
    
    public double getPerimeter(){
        return (2 * Math.PI * this.radius);
    }
    
    public double getDiameter(){
        return (2 * this.radius);
    }
    
    public void printCircle(){
        System.out.println("Radius: " + this.radius + "\nDate Created : " + super.getDateCreated());
    }
}
