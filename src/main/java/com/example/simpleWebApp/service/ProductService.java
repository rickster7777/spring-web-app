package com.example.simpleWebApp.service;

import com.example.simpleWebApp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    // Use an ArrayList to make the list mutable
    private List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(101, "IPhone", "Apple", 90000),
            new Product(102, "Gwagon", "Merc", 90000000)
    ));

    public List<Product> getProducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst()
                .orElse(null);
    }

    public Product addProduct(Product product) {
        products.add(product); // This will now work
        return product;
    }
}
