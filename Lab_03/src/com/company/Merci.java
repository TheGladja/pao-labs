package com.company;

public class Merci extends CandyBox{
    private int length;

    public Merci(){};
    public Merci(String flavour, String origin, int length){
        this.flavour = flavour;
        this.origin = origin;
        this.length = length;
    }

    public int getVolume(){
        return length*length*length;
    }

    public boolean equals(Merci x, Merci y){
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
