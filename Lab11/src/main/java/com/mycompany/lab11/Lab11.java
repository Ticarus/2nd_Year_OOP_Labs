package com.mycompany.lab11;

public class Lab11 {

    public static void main(String[] args) {
       ex3();
    }
    
    public static void ex1(){
        Circle c = new Circle(1);
        System.out.println(c.toString());
        System.out.println(c.getColor());
        System.out.println(c.getRadius());
        System.out.println(c.getArea());
        System.out.println(c.getDiameter());
        
        Rectangle r = new Rectangle(2,4);
        System.out.println(r.toString());
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
    }
    
    public static void ex2(){
        Pet p = new Pet(3, true);
        System.out.println(p.getIsMale());
        
        Dog d = new Dog(3,  true, "white", "doge");
        d.beAdopted("Peter", "Lassie");
        System.out.println("Name : " + d.getName() + "\nHuman Age : " + d.getHumanAge());
        d.speak();
    }
    
    public static void ex3(){
        Point p1 = new Point();
        Point p2 = new Point(10, 30.5);
        
        System.out.println("Distance : " + p1.distance(p2));
        System.out.println("Distance : " + Point.distance(p1, p2));
        
        ThreeDPoint p3 = new ThreeDPoint();
        ThreeDPoint p4 = new ThreeDPoint(20, 40, 5);
        
        System.out.println("Distance : " + p3.distance(p4));
    }
}
