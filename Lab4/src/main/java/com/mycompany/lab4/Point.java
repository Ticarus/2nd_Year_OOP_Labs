package com.mycompany.lab4;

public class Point {
    private int x;
    private int y;
    
    //Constructs a new point at the origin, (0,0)
    public Point(){
        this(0, 0);  //Calls Point(0,0) constructor 
    }
    
    //Constructs a new point with the given (x,y) location
    public Point(int x, int y){
        setLocation(x, y);
    }
    
    //Returns the distance between this Point and (0,0)
    public double distanceFromOrigin(){
        return Math.sqrt(x * x + y * y);
    }
    
    //Returns the x-coordinate of this point 
    public int getX(){
        return x;
    }
    
    //Returns the y-coordinate of this point
    public int getY(){
        return y;
    }
    
    //Sets this point's(x,y) location to the given values
    public void setLocation(int x, int y){
        this.x = x;
        this.y = y;
    }
    
    //Returns a String representationof this point 
    public String toString(){
        return "(" + x + "," + y + ")";
    }
    
    //Shifts this point's location by the given amount 
    public void translate(int dx, int dy){
        setLocation(x + dx , y + dy);
    }
    
    public int quadrant(){
        if(x > 0 && y > 0){
            return 1;
        }
        else if(x < 0 && y > 0){
            return 2;
        }
        else if(x < 0 && y < 0){
            return 3;
        }
        else if(x > 0 && y < 0){
            return 4;
        }
        else{
            return 0;
        }
    }
}
