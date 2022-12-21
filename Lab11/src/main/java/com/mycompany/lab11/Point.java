package com.mycompany.lab11;

public class Point {
    protected double x;
    protected double y;
    
    public Point(){
        
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public double distance(Point secondPoint){
        return (Math.sqrt(Math.pow((secondPoint.x - this.x), 2) + Math.pow((secondPoint.y - this.y), 2)));
    }
    
    public static double distance(Point p1, Point p2){
        return (Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2)));
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
}
