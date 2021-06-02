package com.BuyEggsOnline.Mydemo.services;

import com.BuyEggsOnline.Mydemo.Model.Product;
import com.BuyEggsOnline.Mydemo.entities.Egg;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Service 
public class ProductService {

	public List<Product> getAllProducts(){
		return List.of(
				new Product(
						1,
						"Franco Farm",
						"Red Egg",
						Egg.D,
						10,
						56),
				new Product(
						2,
						"Franco Farm",
						"White Egg",
						Egg.O,
						15,
						24),
				new Product(
						3,
						"Messi Farm",
						"Red Egg",
						Egg.D,
						17,
						56),
				new Product(
						4,
						"Messi Farm",
						"White Egg",
						Egg.O,
						20,
						24)
		);
	}

	public Product InsertProduct(@RequestBody Product product){
		Product product1 = new Product(product);
		return product1;
	}

	public Optional<Product> findById(int id){
		/*List<Product> messi = getAllProducts();
		messi.forEach(product -> {
			if (product.getId().equals(id))
				return product;
		});*/
		return null;
		//return getAllProducts().stream().filter(product -> product.getId().equals(id)).findFirst();
	}

	public Product filterProducts(Predicate<Product> strategy) {
		return getAllProducts().stream().filter(strategy).findFirst().orElse(null);
	}

	public Product modify(Product product){

	}
}