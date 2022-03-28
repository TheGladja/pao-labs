package com.company;

public class Area {
    private CandyBag candyList;
    private int number;
    private String street;

    public Area(){}
    public Area(CandyBag candyList, int number, String street){
        this.candyList = candyList;
        this.number = number;
        this.street = street;
    }

    public void printAddress(){
        System.out.println("Street: " + street + ", Number: " + number);
        candyList.printCandys();
    }

    public static void main(String[] args) {
        CandyBox c1 = new Merci("snake", "merci", 13);
        CandyBox c2 = new Milka("dog", "milka", 7, 9);
        CandyBox c3 = new Lindt("cat", "lindt", 3, 5, 4);

        CandyBag x = new CandyBag(c1);
        x = new CandyBag(c2);
        x = new CandyBag(c3);

        Area area = new Area(x, 11, "Eternity");

        area.printAddress();
    }
}
