package com.mycompany.lab8;

import java.util.Random;

public class Point2D {
    private int x;
    private int y;
    
    //static fields are shared by all objects
    private static int limX = 10;
    private static int limY = 10;
    
    public Point2D(){
        Random rng = new Random();
        x = rng.nextInt(limX);
        y = rng.nextInt(limY);
    }
    
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        return x;
    }
    
    public int getY(){
        return y;
    }
    
    public static int getLimX(){
        return limX;
    }
    
    public static int getLimY(){
        return limY;
    }
    
    public void setX(int x){
        this.x = x;
    }  
    
    public void setY(int y){
        this.y = y;
    }
    
    public static void setLimX(int aLimX){
        limX = aLimX;
    }
    
    public static void setLimY(int aLimY){
        limY = aLimY;
    }
    
    public String toString(){
        return "x : " + x + " y : " + y;
    }
    
    public boolean equals(int x, int y){
        return this.x == x && this.y == y;
    }
    
    public boolean equals(Point2D p){
        return (this == p) ? true : false;
    }
    
    public void addPPoints(Point2D p){
        this.x += p.x;
        this.y += p.y;
    }
    
    public Point2D sumPoints(Point2D p){
        Point2D p1 = new Point2D(this.x + p.x, this.y + p.y);
        return p1;
    }
}
