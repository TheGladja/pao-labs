package com.company;

public class CandyBag {
    static CandyBox[] candy = new CandyBox[1001];
    static int ct = 0;

    public CandyBag(){}
    public CandyBag(CandyBox candy){
        this.candy[ct++] = candy;
    }

    public void printCandys(){
        for(int i = 0; i < ct; i++)
            System.out.println(candy[i].toString());
    }
}
