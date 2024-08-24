package com.example.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor

public class Product {
    private int prodId;
    private String prodName;
    private String prodDesc;
    private int prodPrice;
}
