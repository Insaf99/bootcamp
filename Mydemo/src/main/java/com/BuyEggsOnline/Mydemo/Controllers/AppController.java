package com.BuyEggsOnline.Mydemo.Controllers;
import com.BuyEggsOnline.Mydemo.services.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "holi")
public class AppController { //controlador tiene una variable referencia al servicio que queremos llamar

    @GetMapping
    public String sayHello(Model model){
        System.out.println("Saying hello world in controller");
        model.addAttribute("message","Greetings from Franco");
        return "hello";
    }
    private ProductService productService;

    public String getAllProducts(Model model) {
        System.out.println("Saying hello world in controller2");
        model.addAttribute("products",productService.getAllProducts());
        return "product_all";
    }
}
