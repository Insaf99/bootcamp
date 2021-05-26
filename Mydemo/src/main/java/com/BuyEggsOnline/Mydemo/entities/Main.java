package com.BuyEggsOnline.Mydemo.entities;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/*You have to make a Farm, with a Farmer and a Hen House with 40 Hens,
70% of Heans lay Red Eggs and 30% Heans lay White Eggs, each Hen will lay 2 eggs per day.
Your Farmer have to recolect them inside an Egg's Carton, each Egg's Carton (6 x 5)
has a capacity for 30 eggs and it will be classified them by color.
Egg's Cartons Console representation in 1 day. e.g. (O): white eggs (D): red eggs (G): empty
 */
public class Main {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        System.out.println("Welcome to my farm!");
        Farmer farmer = Farmer.getInstance("Lio messi");
        farmer.diference(Egg.O);
        farmer.diference(Egg.D);
        logger.error("Welcome to log4j dear user!");
    }
}