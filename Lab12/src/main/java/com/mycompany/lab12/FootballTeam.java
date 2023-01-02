package com.mycompany.lab12;

public class FootballTeam extends SportTeam{
    protected String leagueName;
    
    public FootballTeam(String name, int seasonScore, String[] players, String leagueName){
        super(name, seasonScore, players);
        this.leagueName = leagueName;
    }
    
    public String toString(){
        return super.toString() + " League Name : " + leagueName;
    }
    
    public boolean equals(FootballTeam f){
        if(this.seasonScore == f.seasonScore){
            return true;
        }
        else{
            return false;
        }
    }
}
