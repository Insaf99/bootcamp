package com.BuyEggsOnline.Mydemo;

import com.BuyEggsOnline.Mydemo.entities.Egg;
import com.BuyEggsOnline.Mydemo.entities.Farmer;
import com.BuyEggsOnline.Mydemo.entities.Main;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MydemoApplication {
	private static final Logger logger = LogManager.getLogger(Main.class);
	public static void main(String[] args) {
		SpringApplication.run(MydemoApplication.class, args);
		System.out.println("Welcome to my farm!");
		Farmer farmer = Farmer.getInstance("Lio messi");
		farmer.diference(Egg.O);
		farmer.diference(Egg.D);
		logger.error("Welcome to log4j dear user!");
	}

}
