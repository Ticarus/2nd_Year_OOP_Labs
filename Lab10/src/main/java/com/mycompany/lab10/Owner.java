package com.mycompany.lab10;

import java.util.Date;

public class Owner {
    private String name;
    private int phoneNo;
    private Date date;
    
    public Owner(String name, int phoneNo){
        this.name = name;
        this.phoneNo = phoneNo;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getPhoneNo(){
        return this.phoneNo;
    }
    
    public void phoneNo(int phoneNo){
        this.phoneNo = phoneNo;
    }
    
    public Date getDate(){
        return this.date;
    }
    
    public void setDate(Date date){
        this.date = date;
    }
    
    public String toString(){
        return ("Name : " + this.name + " & Phone Number : " + this.phoneNo + " & Date : " + this.date);
    }
}
