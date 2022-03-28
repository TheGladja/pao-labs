package com.company;

public class Milka extends CandyBox {
    private int radius, height;

    public Milka(){}
    public Milka(String flavour, String origin, int radius, int height){
        this.flavour = flavour;
        this.origin = origin;
        this.radius = radius;
        this.height = height;
    }

    public int getVolume(){
        return 2*radius*height;
    }

    public boolean equals(Milka x, Milka y){
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
