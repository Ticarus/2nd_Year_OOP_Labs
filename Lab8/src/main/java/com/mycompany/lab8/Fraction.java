package com.mycompany.lab8;

public class Fraction {
    public int num;
    public int den;
    
    public Fraction(int num, int den){
        this.num = num;
        this.den = den;
    }
    
    public Fraction(){
        
    }
    
    public Fraction(Fraction f){
        this.num = f.num;
        this.den = f.den;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public int getDen(){
        return this.den;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public void setDen(int den){
        this.den = den;
    }
    
    public void addFraction(Fraction f){
        int td = this.den;
        int fd = f.den;
        int fn = f.num * td;
        this.num *= fd;
        this.den *= fd;
        this.num += fn;
    }
    
    public double size(){
        return this.num / this.den;
    }
    
    public Fraction larger(Fraction f){
        return (this.size() > f.size()) ? this : f;
    }
    
    public void inverse(){
        if(this.num == 0){
            System.out.println("ERROR");
        }
        else{
            int n = this.num;
            this.num = this.den;
            this.den = n;
        }
    }
    
    public boolean equals(Fraction f){
        return (this.num == f.num && this.den == f.den) ? true : false;
    }
    
    public String toString(){
        return this.num + " / " + this.den;
    }
}
