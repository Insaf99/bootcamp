package com.BuyEggsOnline.Mydemo.services;

import com.BuyEggsOnline.Mydemo.Model.Product;
import com.BuyEggsOnline.Mydemo.entities.Egg;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class ProductService {

	List<Product> repository = new ArrayList<>();

	public ProductService() {
		this.repository.add(new Product(
				1,
				"Franco Farm",
				"Red Egg",
				Egg.D,
				10,
				56));
		this.repository.add(new Product(
				2,
				"Franco Farm",
				"White Egg",
				Egg.O,
				15,
				24));
		this.repository.add(new Product(
				3,
				"Messi Farm",
				"Red Egg",
				Egg.D,
				17,
				56));
		this.repository.add(new Product(
				4,
				"Messi Farm",
				"White Egg",
				Egg.O,
				20,
				24));
	}

	public List<Product> getAllProducts(){
		return repository;
	}

	public Product InsertProduct(Product product){
//		Product product1 = new Product(product);
		if (repository.contains(product)) return null;
		repository.add(product);
		return product;
	}

	public Product findById(int id){
		Product result = null;
		for(Product product: repository) {
			if (product.getId()==id) result = product;
		}
		return result;
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}

	public Product modify(Product product){
		int index = repository.indexOf(product);
		if(index == -1) {
			return product;
		}
		repository.set(index, new Product(product.getId(), product.getFarm(), product.getName(), product.getType(), product.getPrice(), product.getStock()));
		return product;
	}

	public void delete(int id){
		repository.remove(findById(id));
	}
}