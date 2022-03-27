package com.company.classes;

public class Room {
    private int number, floor;
    private String type;

    public Room(){}
    public Room(int number, String type, int floor){
        this.number = number;
        this.type = type;
        this.floor = floor;
    }

    public int getNumber(){
        return number;
    }

    public void setNumber(int number){
        this.number = number;
    }

    public String getType(){
        return type;
    }

    public void setType(String type){
        this.type = type;
    }

    public int getFloor(){
        return floor;
    }

    public void setFloor(int floor){
        this.floor = floor;
    }

    public static void main(String[] args) {
        Room room1 = new Room(13, "3 persoane", 1);
        Room room2 = new Room(259, "2 persoane", 9);

        System.out.println(room1.getNumber() + " " + room1.getType());
        System.out.println(room2.getNumber() + " " + room2.getType());
    }
}
