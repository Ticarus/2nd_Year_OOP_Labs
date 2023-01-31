package com.mycompany.lab14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lab14 {

    public static void main(String[] args) throws FileNotFoundException{
        ex3();
    }
    
    public static void ex1(){
        Staff staff = new Staff("Ayşe", 1000.0);
        PartTimeStaff ptStaff = new PartTimeStaff("Ahmet", 45, 20);
        SalesStaff sStaff = new SalesStaff("Zeynep", 5000.0, 0.2);
        
        System.out.println(staff.displaySalary());
        System.out.println(ptStaff.displaySalary());
        System.out.println(sStaff.displaySalary());
    }
    
    public static void ex2(){
        Animal animal = new Animal(true, 2);
        Cat cat = new Cat("blue", false, 4);
        Bird bird = new Bird(3.5, true, 2);
        
        animal.makeNoise();
        cat.makeNoise();
        bird.makeNoise();
    }
    
    public static void ex3() throws FileNotFoundException{
        ArrayList<City> cityList = new ArrayList<City>();
        
        String path = "cities.txt";
        File f = new File(path);
        
        Scanner sc = new Scanner(f);
        while(sc.hasNext()){
            int no = sc.nextInt();
            String name = sc.next();
            City c = new City(no, name);
            cityList.add(c);
        }
        
        for(int i = 0 ; i < cityList.size() ; i++){
            System.out.println(cityList.get(i).getNo() + " " + cityList.get(i).getName());
        }
    }
}
