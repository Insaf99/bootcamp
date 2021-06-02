package com.BuyEggsOnline.Mydemo.entities;

public class Farmer extends Person {     //inherence
    private static Farmer instance; //Singleton

    public Farmer() {
    }

    public static Farmer getInstance(String nom) {              //Singleton
        if (instance == null) instance = new Farmer();
        name = nom;
        return instance;
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public void diference(Egg Color) {
        HenHouse hen = new HenHouse("My HenHouse", 40); // instance of class
        Collecteggs(hen.makeHens(Color), Color);
    }

    public void Collecteggs(double value, Egg color) {
        String carton[][] = new String[6][5];
        while (value > 0) {    // check that I have no eggs for recollect
            System.out.println(" ");
            for (int i = 0; i <= carton.length - 1; i++) {
                for (int j = 0; j <= carton[i].length - 1; j++) {
                    if (value == 0) {
                        System.out.print("(G)");
                    } else {
                        System.out.print("(" + color + ")");
                        value -= 1;
                    }
                }
                System.out.println(" ");
            }
        }
    }
}
