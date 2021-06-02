package com.BuyEggsOnline.Mydemo.Controllers;
import com.BuyEggsOnline.Mydemo.Model.Product;
import com.BuyEggsOnline.Mydemo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//mi productcontroller deberia tener get,post,put,delete
@RestController
@RequestMapping(path= "api/v1/products")
public class ProducController {
    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){return productService.getAllProducts();}

    @GetMapping("/id={id}")
    public Product productByid(@PathVariable int id){
        return productService.findById(id);
    }

    @PostMapping("/")
    public Product InsertProduct(@RequestBody Product product){
        productService.InsertProduct(product);
        return product;
    }

    @PutMapping
    public Product modifyProduct(@RequestBody Product product){
        return productService.modify(product);
    }

    @DeleteMapping(value ="/{id}")
    public void deleteProducts(@PathVariable("id") int id) {
        productService.delete(id);
    }

}
