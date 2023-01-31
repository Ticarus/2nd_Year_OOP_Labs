package com.mycompany.lab13;

import java.io.*;
import java.util.Scanner;

public class Employee {
    private String name;
    private int no;
    private double salary;
    
    public Employee(String name, int no){
        this.name = name;
        this.no = no;
    }
    
    public Employee(Employee x){
        this(x.getName(),x.getNo());
    }
    
    public Employee(String fileName) throws Exception{
        File f = new File(fileName);
        Scanner kb = new Scanner(f);
        while(kb.hasNext()){
            name = kb.next();
            no = kb.nextInt();
        }
        kb.close();
    }
    
    public Employee(File f) throws Exception{
        Scanner kb = new Scanner(f);
        while(kb.hasNext()){
            name = kb.next();
            no = kb.nextInt();
        }
        kb.close();
    }
    
    public String getName(){
        return name;
    }
    
    public int getNo(){
        return no;
    }
    
    public void setNo(int no){
        this.no = no;
    }
}
