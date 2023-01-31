package com.mycompany.lab13;

import java.io.*;
import java.util.Scanner;

public class Lab13 {

    public static void main(String[] args) throws Exception{
        ex3();
    }
    
    public static void ex1() throws Exception{
        File f = new File("test.txt");
        PrintWriter pw = new PrintWriter(f);
        for(int i = 0 ; i < 100 ; i++){
            pw.print("sqrt(" + i + ")=");
            pw.println(Math.sqrt(i));
        }
        pw.close();
    }
    
    public static void ex2() throws Exception{
        File f = new File("course.txt");
        Scanner kb = new Scanner(f);
        while(kb.hasNext()){
            String courseName = kb.next();
            int noOfStudents = kb.nextInt();
            System.out.println("Course name : " + courseName + " No of Students : " + noOfStudents);
        }
        kb.close();
    }
    
    public static void ex3() throws Exception{
        File f = new File("employee.txt");
        Employee e = new Employee(f);
        System.out.println("Name: " + e.getName() + " No: " + e.getNo());
        String s = "employee2.txt";
        Employee e2 = new Employee(s);
        System.out.println("Name: " + e2.getName() + " No: " + e2.getNo());
    }
}
