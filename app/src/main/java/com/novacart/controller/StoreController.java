package com.novacart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/store")
public class StoreController {

    @GetMapping("/products")
    public List<Map<String, Object>> getProducts() {
        return Arrays.asList(
            Map.of("id", 1, "name", "Quantum X Pro Laptop", "price", 1299.99, "stock", "In Stock", "image", "💻"),
            Map.of("id", 2, "name", "Nova Noise-Cancelling Headphones", "price", 249.50, "stock", "Low Stock", "image", "🎧"),
            Map.of("id", 3, "name", "Aura 4K Smart Monitor", "price", 499.00, "stock", "In Stock", "image", "🖥️")
        );
    }
}
