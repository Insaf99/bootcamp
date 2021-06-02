package com.BuyEggsOnline.Mydemo.Model;

import com.BuyEggsOnline.Mydemo.entities.Egg;
import com.BuyEggsOnline.Mydemo.entities.Farm;

import java.util.Objects;

public class Product {
	private int id;
	private String farm;
	private String name;
	private Egg type;
	private double price;
	int stock;

	public Product(int id, String farm, String name, Egg type, double price , int stock){
		this.id=id;
		this.farm=farm;
		this.name=name;
		this.type=type;
		this.price=price;
		this.stock=stock;
	}

	public Product(Product product) {
		this.id = product.getId();
		this.farm=product.getFarm();
		this.name=product.getName();
		this.type=product.getType();
		this.price=product.getPrice();
		this.stock=product.getStock();
	}

	public int getId() {return id;}

	public void setId(int id) {this.id = id;}

	public String getFarm() {return farm;}

	public void setFarm(String farm) {this.farm = farm;}

	public String getName() {return name;}

	public void setName(String name) {this.name = name;}

	public Egg getType() {return type;}

	public void setType(Egg type) {this.type = type;}

	public double getPrice() {return price;}

	public void setPrice(double price) {this.price = price;}

	public int getStock() {return stock;}

	public void setStock(int stock) {this.stock = stock; }

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Product product = (Product) o;
		return id == product.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
