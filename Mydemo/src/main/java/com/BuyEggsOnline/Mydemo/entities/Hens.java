package com.BuyEggsOnline.Mydemo.entities;
class Hens{
    Egg Type;
    private int cant=0;
    Hens(Egg str,int num){
        Type=str;
        cant=num;
    }
    public void addHens(int hen){
        cant=cant+hen;
    }
    
    public double makeEggs(Egg color){
        double red= cant*1.4;
        double whites= cant*0.6;
        if (color==Egg.D){
            System.out.println("====Red====");
            return red;
        } else{
            System.out.println("====White====");
            return whites; }

}}
    //(i<((numberOfHens*70)/100) ? Egg.D : Egg.O, eggsPerDay)

