package com.example.inventory.repository;

import com.example.inventory.model.Product;
import java.util.List;

public class ProductRepository {

    public void save(Product product) { ... }
    public Product findById(String productId) { ... }
    public List<Product> findByCategory(String categoryId) { ... }
    public List<Product> findLowStock(int threshold) { ... }
    public void updatePrice(String productId, int newUnitPrice) { ... }
}