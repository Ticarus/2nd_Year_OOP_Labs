package com.mycompany.lab14;

public class City {
    private int no;
    private String name;

    public City(int no, String name){
        this.no = no;
        this.name = name;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getNo(){
        return this.no;
    }
    
    public void setNo(int no){
        this.no = no;
    }
}
