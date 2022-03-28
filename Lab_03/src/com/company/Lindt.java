package com.company;

public class Lindt extends CandyBox{
    private int length, width, height;

    public Lindt(){}
    public Lindt(String flavour, String origin, int length, int width, int height){
        this.flavour = flavour;
        this.origin = origin;
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int getVolume(){
        return length*width*height;
    }

    public boolean equals(Lindt x, Lindt y){
        if(x.flavour.equals(y.flavour) && x.origin.equals(y.origin) && x.getVolume() == y.getVolume())
            return true;
        return false;
    }

    @Override
    public String toString(){
        int volume = getVolume();
        return "The " + origin + " of " + flavour + " has volume " + volume;
    }
}
