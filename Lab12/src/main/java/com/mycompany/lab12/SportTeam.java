package com.mycompany.lab12;

public class SportTeam {
    protected String name;
    protected int seasonScore;
    protected String[] players;
    
    public SportTeam(String name, int seasonScore, String[] players){
        this.name = name;
        this.seasonScore = seasonScore;
        this.players = players;
    }
    
    public String toString(){
        return "Team Name : " + name + " Score : " + seasonScore;
    }
    
    public boolean equals(SportTeam x){
        if(this.name == x.name){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int compareScore(SportTeam s){
        if(this.seasonScore > s.seasonScore){
            return 1;
        }
        else{
            return 0;
        }
    }
    
    public int calculateScore(){
        return this.seasonScore * 1000;
    }
}
