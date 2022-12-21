package com.mycompany.lab4;

import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        ex2();
    }
    
//------------------------------------------------------------------------------------------------
    
    public static void ex1(){
        Scanner sc = new Scanner(System.in);
        
        Rectangle r1 = new Rectangle();
        r1.setDimensions();
        System.out.println("Width : " + r1.width + "\nHeight : " + r1.height + "\nArea : " + r1.calculateArea() + "\nPerimeter : " + r1.calculatePerimeter());
        
        Rectangle r2 = new Rectangle();
        
        System.out.print("Input the width of the rectangle : ");
        r2.width = sc.nextInt();
        
        System.out.print("Input the height of the rectangle : ");
        r2.height = sc.nextInt();
        
        System.out.println("Width : " + r2.width + "\nHeight : " + r2.height + "\nArea : " + r2.calculateArea() + "\nPerimeter : " + r2.calculatePerimeter());
    }
    
//------------------------------------------------------------------------------------------------
    
    public static void ex2(){
        System.out.println("Before creating objects : " + Cylinder.getNoOfCylinder());
        Cylinder c1 = new Cylinder();
        System.out.println("Radius : " + c1.r + "\nHeight : " + c1.h);
        System.out.println("After creating first object : " + c1.getNoOfCylinder());
        
        Cylinder c2 = new Cylinder(2, 5);
        System.out.println("Base area : " + c2.calculateBaseArea());
        System.out.println("Surface area : " + c2.calculateSurfaceArea());
        System.out.println("Volume : " + c2.calculateVolume());
        System.out.println("Mass : " + c2.calculateMass(1.34));
        
        System.out.println("After crating second object : " + c1.getNoOfCylinder());
        System.out.println("After creating second object : " + c2.getNoOfCylinder());
    }
    
//------------------------------------------------------------------------------------------------

    public static void ex3(){
        Point p1 = new Point(7, 2);
        Point p2 = new Point(4, 3);
        
        System.out.println("p1 is " + p1);
        System.out.println("Distance from origin = " + p1.distanceFromOrigin());
        System.out.println("p2 is " + p2);
        System.out.println("Distance from origin = " + p2.distanceFromOrigin());
        
        p1.translate(11, 6);
        p2.translate(1, 7);
        
        System.out.println("p1 is " + p1);
        System.out.println("p2 is " + p2);
        
        System.out.println("Quadrant of p1 : " + p1.quadrant());
        System.out.println("Quadrant of p2 : " + p2.quadrant());
    }
}
