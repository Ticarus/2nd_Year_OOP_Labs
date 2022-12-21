package com.mycompany.lab4;

public class Rectangle {
    public int width;
    public int height;
    
    public Rectangle(){
        this(5, 4);
    }
    
    public Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }
    
    public int calculatePerimeter(){
        return 2 * (this.width + this.height); 
    }
    
    public int calculateArea(){
        return this.width * this.height;
    }
    
    public int[] setDimensions(){
        int[] dimensions = new int[2];
        this.width = (int)(Math.random() * 100 + 1);
        this.height = (int)(Math.random() * 100 + 1);
        dimensions[0] = this.width;
        dimensions[1] = this.height;
        return dimensions;
    }
}
