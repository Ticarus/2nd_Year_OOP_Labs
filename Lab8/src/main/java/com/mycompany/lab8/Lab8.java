package com.mycompany.lab8;

public class Lab8 {

    public static void main(String[] args) {
        ex3();
    }
    
    public static void ex1(){
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(5, 10);
        
        System.out.println(p1.toString());
        System.out.println(p1.equals(p2));
        
        Point2D p3 = new Point2D(3, 9);
        
        p3.addPPoints(p1);
        
        System.out.println(p1.toString());
        System.out.println(p3.toString());
        
        Point2D p4 = p1.sumPoints(p2);
        
        System.out.println(p4.toString());
    }
    
    public static void ex2(){
        MyInteger myInt1 = new MyInteger(24);
        
        System.out.println(myInt1.info());
        
        MyInteger myInt2 = new MyInteger(35);
        
        System.out.println(myInt2.info());
        System.out.println(myInt1.equals(myInt2));
        
        myInt2.add(myInt1);
        
        System.out.println(myInt2.info());
    }
    
    public static void ex3(){
        Fraction f1 = new Fraction(1, 8);
        Fraction f2 = new Fraction(1, 3);
        
        f1.addFraction(f2);
        
        System.out.println(f1.toString());
        
        Fraction f3 = new Fraction(f1);
        
        System.out.println(f3.toString());
        System.out.println(f1.equals(f3));
        
        f2.inverse();
        
        System.out.println(f2.toString());
        System.out.println(f1.larger(f2));
    }
}
