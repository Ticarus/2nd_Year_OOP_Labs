package com.mycompany.lab6;

public class Lab6 {

    public static void main(String[] args) {
       ex3();
    }
    
//-------------------------------------------------------------------------------------
    
    public static void ex1(){
        Plant p = new Plant(1.5, 3);
        
        p.waterPlant(2);
        
        System.out.println("Height : " + p.getHeight() + " Humidity Level : " + p.getHumidityLevel());
        
        System.out.println(p.getInfo());
        
        Plant p2 = new Plant(3.0, 5);
        
        System.out.println("Total Plants : " + Plant.getTotalPlants());
    }
    
//-------------------------------------------------------------------------------------
    
    public static void ex2(){
        Point2D p1 = new Point2D();
        Point2D p2 = new Point2D(5, 10);
        
        System.out.println("p1 : " + p1.toString());
        System.out.println("p2 : " + p2.toString());
        
        int p1x = p1.getX();
        int p1y = p1.getY();
        int p2x = p2.getX();
        int p2y = p2.getY();
        p1.setX(p1x + p2x);
        p1.setY(p1y + p2y);
        
        System.out.println("p1 : " + p1.toString());
        
        int x = p1.getX() + p2.getX();
        int y = p1.getY() + p2.getY();
        Point2D p3 = new Point2D(x, y);
        
        System.out.println("p3 : " + p3.toString());
        
        System.out.println("p1 and p3 is equal : " + p1.equals(p3.getX(), p3.getY()));
    }
    
//-------------------------------------------------------------------------------------
    
    public static void ex3(){
        Student s1 = new Student("Zeynep Kaya", "Üsküdar");
        System.out.println(s1.toString());
        
        s1.setAddress("Acıbadem");
        System.out.println(s1.toString());
        
        System.out.println(s1.getName());
        System.out.println(s1.getAddress());
        
        s1.addCourseGrade("SE201", 89);
        s1.addCourseGrade("COME201", 57);
        s1.addCourseGrade("COME205", 96);
        
        s1.printGrades();
        
        System.out.println("The average grade is " + s1.getAverageGrade());
    }
}
