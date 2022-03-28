package com.company;

public abstract class CandyBox {
    protected String flavour, origin;

    public CandyBox(){}
    public CandyBox(String flavour, String origin){
        this.flavour = flavour;
        this.origin = origin;
    }

    public abstract int getVolume();

    @Override
    public String toString(){
        return "[flavour: " + flavour + ", origin: " + origin + "]";
    }
}
