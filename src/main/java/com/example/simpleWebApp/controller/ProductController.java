package com.example.simpleWebApp.controller;

import com.example.simpleWebApp.model.Product;
import com.example.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products") // Base URL for all product-related requests
public class ProductController {

    @Autowired
    private ProductService service;

    // Handles HTTP GET requests for /products
    @GetMapping
    public List<Product> getProducts() {
        return service.getProducts();
    }

    // Handles HTTP GET requests for /products/{prodId}
    @GetMapping("/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }

    // Handles HTTP POST requests for /products
    @PostMapping
    public Product addProduct(@RequestBody Product product) {
        //if @RequestBody is not used annotation it gives 0, null, null, 0
        return service.addProduct(product);
    }

    // Handles HTTP PUT requests for products
//    @PutMapping
//    public Product updateProduct(@RequestBody Product product) {
//
//    }

}
