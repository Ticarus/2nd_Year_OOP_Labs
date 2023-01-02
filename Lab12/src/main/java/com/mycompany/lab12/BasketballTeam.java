package com.mycompany.lab12;

public class BasketballTeam extends SportTeam{
    protected double averageHeight;
    
    public BasketballTeam(String name, int seasonScore, String[] players, double averageHeight){
        super(name, seasonScore, players);
        this.averageHeight = averageHeight;
    }
    
    public double calculateScore(int baseValue){
        return (this.averageHeight * 1000) + baseValue;
    }
}
