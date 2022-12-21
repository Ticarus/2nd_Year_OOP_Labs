package com.mycompany.lab9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Lab9 {

    public static void main(String[] args) {
        ex2();
    }
    
    public static void ex1(){
        ArrayList<Student> studentList = new ArrayList<Student>();
        Student x = new Student(18,"Ali");
        studentList.add(0,x);
        System.out.println("Name : " + studentList.get(0).getName());
        Student y = studentList.get(0);
        System.out.println("Name : " + y.getName());
        
        Scanner sc = new Scanner(System.in);
        for(int i = 1 ; i <= 3 ; i++){
            System.out.println("Enter your age : ");
            int age = sc.nextInt();
            System.out.println("Enter your name : ");
            String name = sc.next();
            Student z = new Student(age, name);
            studentList.add(z); 
        }
        
        studentList.remove(2);
        
        for(int i = 0 ; i < studentList.size() ; i++){
            Student a = studentList.get(i);
            System.out.println("Name : " + a.getName() + " & Age : " + a.getAge());
        }
    }
    
    public static void ex2(){
        String[] dog_names = {"AX","BX","CX","DX"};
        String[] owner_names = {"Ali","Can","Emre","Duygu"};
        ArrayList<Dog> dogs = new ArrayList<>();
        
        Random rn = new Random();
        
        for(int i = 0 ; i < 5 ; i++){
            String name = dog_names[rn.nextInt(dog_names.length)];  // range[0,dog_names.length)
            String owner_name = owner_names[rn.nextInt(owner_names.length)]; 
            int age = rn.nextInt(20);
            Dog d = new Dog(0,name,owner_name,age);
            dogs.add(d);
        }
        
        for(int i = 0 ; i < dogs.size() ; i++){
            Dog d = dogs.get(i);
            System.out.println("---------------------");
            System.out.println(d.toString());
            System.out.println("---------------------");
        }
    }
}
