package com.mycompany.lab10;

public class Lab10 {

    public static void main(String[] args) {
        ex3();
    }
    
    public static void ex1(){
        Flower flower = new Flower("Pink", "Rose", 1.5);
        Bouquet bouquet = new Bouquet("Valentine's Day", flower, 13);
        System.out.println(bouquet.getCost());
    }
    
    public static void ex2(){
        Room room = new Room("Guest Room", 3, 40);
        Building b = new Building("BlueHotel",room ,50);
        System.out.println(b.getTotalArea());
    }
    
    public static void ex3(){
        Room room = new Room("Guest Room", 3, 40);
        Building b = new Building("Hotel XYZ", room, 25);
        Owner[] owners = new Owner[2];
        owners[0] = new Owner("Ali", 123);
        owners[1] = new Owner("Zeynep", 456);
        
//        b.DisplayAllOwners();
        
        System.out.println("Name : " + owners[0].getName() + " & Date : " + owners[0].getDate());
        /*
        Owner[] owner_list = new Owner[2];
        
        owner_list = b.getOwners();
        */
        System.out.println("Name : " + owners[1].getName() + " & Date : " + owners[1].getDate());
    }
}
