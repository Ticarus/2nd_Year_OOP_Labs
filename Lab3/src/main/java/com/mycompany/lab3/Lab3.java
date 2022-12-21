package com.mycompany.lab3;

import java.util.Scanner;

public class Lab3 {

    public static void main(String[] args) {
        ex3();
    }
    
//-------------------------------------------------------------------------------------------------
    
    public static void ex1(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the name of the Employee : ");
        String name = sc.next();
        
        System.out.print("Enter the salary of Employee : ");
        double salary = sc.nextDouble();
        
        System.out.print("Enter the working hours : ");
        double hours = sc.nextDouble();
        
        Employee employee = new Employee(name, salary, hours);
        
        employee.addBonus();
        employee.addWork();
        employee.printSalary();
    }
    
//------------------------------------------------------------------------------------------------
    
    public static void ex2(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the title of the movie : ");
        String title = sc.next();
        
        System.out.print("Enter the rating of the movie : ");
        int rating = sc.nextInt();
        
        Movie m1 = new Movie(title, rating);
        
        m1.writeOutput();
        System.out.println("Category : " + m1.getCategory());
    }
    
//-------------------------------------------------------------------------------------------------
    
    public static void ex3(){
        Cat c1 = new Cat();
        c1.move();
        c1.status();
        
        Cat c2 = new Cat(5, 45, "Lucy");
        c2.move2(20);
        c2.status();
    }
}
