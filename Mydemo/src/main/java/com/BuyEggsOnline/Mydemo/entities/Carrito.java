package com.BuyEggsOnline.Mydemo.entities;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

public class Carrito {
    public int cosas=0;

    @GetMapping //obtener datos
    public int eggperday(){
        HenHouse hen = new HenHouse("My HenHouse", 40);
        return (hen.getHennumber()*2);
    }
    /*@PostMapping
    public int añadir(){

    }*/
}
