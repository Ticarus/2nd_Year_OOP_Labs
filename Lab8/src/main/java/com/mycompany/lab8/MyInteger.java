package com.mycompany.lab8;

public class MyInteger {
    public int value;
    public int maxInt = 100;
    
    public MyInteger(int value){
        this.value = value;
    }
    
    public int getValue(){
        return this.value;
    }
    
    public boolean isEven(){
        return (this.value % 2 == 0) ? true : false;
    }
    
    public boolean isEven(MyInteger myInt){
        return (myInt.value % 2 == 0) ? true : false;
    }
    
    public boolean equlas(int value){
        return (this.value == value) ? true : false;
    }
    
    public boolean equals(MyInteger myInt){
        return (this == myInt) ? true : false;
    }
    
    public void add(int value){
        int res = this.value + value;
        
        if(res < maxInt){
            this.value = res;
        }
        else{
            this.value = maxInt;
        }
    }
    
    public void add(MyInteger myInt){
        int res = this.value + myInt.value;
        
        if(res < maxInt){
            this.value = res;
        }
        else{
            this.value = maxInt;
        }
    }
    
    public String info(){
        return "Value : " + this.value;
    }
}
