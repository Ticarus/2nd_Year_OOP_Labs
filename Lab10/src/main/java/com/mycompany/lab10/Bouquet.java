package com.mycompany.lab10;

public class Bouquet {
    private String theme;
    private Flower flower;
    private int numOfFlowers;
    
    public Bouquet(String theme, Flower flower, int numOfFlowers){
        this.theme = theme;
        this.flower = flower;
        this.numOfFlowers = numOfFlowers;
    }
    
    public String getTheme(){
        return this.theme;
    }
    
    public void setTheme(String theme){
        this.theme = theme;
    }
    
    public Flower getFlower(){
        return this.flower;
    }
    
    public void setFlower(Flower flower){
        this.flower = flower;
    }
    
    public int getNumOfFlowers(){
        return this.numOfFlowers;
    }
    
    public double getCost(){
        return this.flower.getUnitPrice() * this.numOfFlowers;
    }
}
