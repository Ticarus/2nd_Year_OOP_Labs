package com.mycompany.lab5;

import java.util.Arrays;
import java.util.Scanner;

public class Lab5 {
    public static void main(String[] args) {
        ex3();
    }
    
//----------------------------------------------------------------------------------------------------
    
    public static void ex1(){
        Person p = new Person();
        p.setName("Mario");
        p.setAge(32);
        System.out.println("Person name : " + p.getName());
        System.out.println("Person age : " + p.getAge());
        System.out.println("Person id of the first object : " + p.getId());
        
        Person p2 = new Person();
        System.out.println("Person id of hte second object : " + p2.getId());
    }
    
//----------------------------------------------------------------------------------------------------
    
    public static void ex2(){
        Product p1 = new Product("Iphone 13", 10, 5000);
        Product p2 = new Product();
        
        System.out.println("Product1 id : " + p1.getProductId());
        System.out.println("Product2 id : " + p2.getProductId());
        
        System.out.println("Name : " + p1.getName());
        System.out.println("Quantity : " + p1.getQuantity());
        System.out.println("Price : " + p1.getPrice());
        System.out.println("Item value : " + p1.getItemValue());
        
        p2.setName("Samsung S7");
        p2.setQuantity(15);
        p2.setPrice(450);
        
        System.out.println("Second product information : " + p2.toString());
    }
    
//----------------------------------------------------------------------------------------------------
    
    public static void ex3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of coefficient a : ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of coefficient b : ");
        double b = sc.nextDouble();
        System.out.print("Enter the value of coefficient c : ");
        double c = sc.nextDouble();
        
        QuadraticEquation q = new QuadraticEquation(a, b, c);
        
        System.out.println("Equation is : " + q.toString());
        
        System.out.println("Discriminant is : " + q.getDiscriminant());
        
        double[] res = q.getRoots();
        System.out.println("The roots are " + Arrays.toString(res));
    }
}
