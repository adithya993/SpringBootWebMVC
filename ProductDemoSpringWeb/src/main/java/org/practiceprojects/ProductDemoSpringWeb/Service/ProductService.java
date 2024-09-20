package org.practiceprojects.ProductDemoSpringWeb.Service;

import org.practiceprojects.ProductDemoSpringWeb.Model.Product;
import org.practiceprojects.ProductDemoSpringWeb.Repository.ProductDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductDB db;

    public List<Product> getAllProducts() {
        return db.findAll();
    }

    public Product getProductByName(String name) {
        return db.findByName(name);
    }

    public void addProduct(Product objProduct){
        db.save(objProduct);
    }
}
