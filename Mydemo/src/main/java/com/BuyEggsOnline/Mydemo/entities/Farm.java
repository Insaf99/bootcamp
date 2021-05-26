package com.BuyEggsOnline.Mydemo.entities;

public class Farm {
    public String name;
}

class HenHouse extends Farm{  //inherence and constructor
    private int hennumber;

    HenHouse(String name, int cap){
        this.name=name;
        this.hennumber=cap;
    }
    public int getHennumber(){return hennumber;}

    public double makeHens(Egg color){
        Hens hens = new Hens(color,getHennumber());
        return hens.makeEggs(color);
    }
}