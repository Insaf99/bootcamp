package com.BuyEggsOnline.Mydemo.entities;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class test{

    @Test
    public void testColor1 (){
        //controlar que double red y double white sean el 70% y 30%
        Egg color1 = Egg.D;
        HenHouse hen = new HenHouse("My HenHouse",40);
        double result= hen.makeHens(color1);
        double expected= (hen.getHennumber()*0.7*2);
        assertEquals(expected,result);
    }

    @Test
    public void testColor2(){
        Egg color2= Egg.O;
        HenHouse hen = new HenHouse("My HenHouse",40);
        double result= hen.makeHens(color2);
        double expected= (hen.getHennumber()*0.3*2);
        assertEquals(expected,result);
    }

    @Test
    public void test(){

    }
}
