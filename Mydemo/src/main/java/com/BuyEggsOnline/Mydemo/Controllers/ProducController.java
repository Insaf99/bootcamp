package com.BuyEggsOnline.Mydemo.Controllers;
import com.BuyEggsOnline.Mydemo.Model.Product;
import com.BuyEggsOnline.Mydemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

//mi productcontroller deberia tener get,post,put,delete
@RestController
@RequestMapping(path= "api/v1/products")
public class ProducController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){return productService.getAllProducts();}

    @GetMapping("/id")
    public Optional<Product> productByid(@RequestParam("id") int ID){
        return productService.findById(ID);
    }

    @PostMapping
    public Product InsertProduct(@RequestBody Product product){
            productService.InsertProduct(product);
            return product;
    }

    @PutMapping
    public Product modifyProduct(@RequestBody Product product){
        return productService.modify(product);
    }

    @DeleteMapping(value ="/{id}")
    public List<Product> deleteProducts(@PathVariable("id") int id){
        return new List<Product>(HttpStatus.OK) {
        }}

}
