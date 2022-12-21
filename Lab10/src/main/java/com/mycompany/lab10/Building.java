package com.mycompany.lab10;

public class Building {
    private String name;
    private Room roomType;
    private int numOfRooms;
    private Owner[] owners;
    
    public Building(String name, Room roomType, int numOfRooms){
        this.name = name;
        this.roomType = roomType;
        this.numOfRooms = numOfRooms;
    }
    
    public Building(String name, Room roomType, int numOfRooms, Owner[] owners){
        this.name = name;
        this.roomType = roomType;
        this.numOfRooms = numOfRooms;
        this.owners = owners;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Room getRoomType(){
        return this.roomType;
    }
    
    public void setRoomType(Room roomType){
        this.roomType = roomType;
    }
    
    public int getNumOfRooms(){
        return this.numOfRooms;
    }
    
    public void setNumOfRooms(int numOfRooms){
        this.numOfRooms = numOfRooms;
    }
    
    public double getTotalArea(){
        return this.roomType.getSizeM2() * this.numOfRooms;
    }
    
    public Owner[] getOwners(){
        return this.owners;
    }
    
    public void setOwners(Owner[] owners){
        this.owners = owners;
    }
    /*
    public void DisplayAllOwners(){
        for (int i = 0 ; i < this.owners.length ; i++) {
            System.out.println("Name : " + owners[i].getName() + " & Phone No : " + owners[i].getPhoneNo());
        }
    }
    */
}
