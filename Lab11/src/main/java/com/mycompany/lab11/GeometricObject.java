package com.mycompany.lab11;

import java.util.Date;

public class GeometricObject {
    protected String color;
    protected boolean filled;
    protected Date dateCreated;
    
    public GeometricObject(){
        
    }
    
    public GeometricObject(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }
    
    public String getColor(){
        return this.color;
    }
    
    public void setColor(String color){
        this.color = color;
    }
    
    public boolean isFilled(){
        return this.filled;
    }
    
    public void setFilled(boolean filled){
        this.filled = filled;
    }
    
    public Date getDateCreated(){
        return this.dateCreated;
    }
    
    public String toString(){
        return ("Color : " + this.color + "\nFilled : " + this.filled + "\nDate Created : " + this.dateCreated);
    }
}
