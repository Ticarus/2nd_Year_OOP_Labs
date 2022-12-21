package com.mycompany.lab11;

public class ThreeDPoint extends Point{
    private double z;
    
    public ThreeDPoint(){
        
    }
    
    public ThreeDPoint(double x, double y, double z){
        super.x = x;
        super.y = y;
        this.z = z;
    }
    
    public double distance(ThreeDPoint secondPoint){
        return (Math.sqrt(Math.pow((secondPoint.x - this.x), 2) + Math.pow((secondPoint.y - this.y), 2) + Math.pow((secondPoint.z - this.z), 2)));
    }
    
    public static double distance(ThreeDPoint p1, ThreeDPoint p2){
        return (Math.sqrt(Math.pow((p2.x - p1.x), 2) + Math.pow((p2.y - p1.y), 2) + Math.pow((p2.z - p1.z), 2)));
    }
    
    public double getZ(){
        return this.z;
    }
}
