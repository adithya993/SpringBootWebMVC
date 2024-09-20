package org.practiceprojects.ProductDemoSpringWeb.Controller;

import org.practiceprojects.ProductDemoSpringWeb.Model.Product;
import org.practiceprojects.ProductDemoSpringWeb.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/product")
    public List<Product> getAllProducts(){
        return service.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public Product getAllProducts(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PostMapping("/product")
    public void addProduct(@RequestBody Product p){
        service.addProduct(p);
    }
}
