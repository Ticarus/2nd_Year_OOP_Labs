package com.mycompany.lab6;

import java.util.Random;

public class Plant {
    private int plantNo;
    private double height;
    private int humidityLevel;
    private static int totalPlants = 0;
    
    public Plant(double height, int humidityLevel){
    this.height = height;
    this.humidityLevel = humidityLevel;
    Random rng = new Random();
    this.plantNo = rng.nextInt(10);  //It is between 0 and 10
    totalPlants++;
    }
    
    public int getPlantNo(){
        return plantNo;
    }
    
    public double getHeight(){
        return height;
    }
    
    public int getHumidityLevel(){
        return humidityLevel;
    }
    
    public static int getTotalPlants(){
        return totalPlants;
    }
    
    public void waterPlant(int humidityLevel){
        this.humidityLevel += humidityLevel;
        height += 0.2;
    }
    
    public String getInfo(){
        return "Plant No : " + plantNo + " Height : " + height + " Humidity Level : " + humidityLevel + "Total Plants : " + totalPlants;
    }
}
