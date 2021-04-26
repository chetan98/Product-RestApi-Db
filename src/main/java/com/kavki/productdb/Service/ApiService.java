package com.kavki.productdb.Service;

import com.kavki.productdb.Entity.Product;
import com.kavki.productdb.Repo.ApiRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ApiService {

    @Autowired
    private ApiRepo apiRepo;

    // Get methods
    public List<Product> getProducts() {
        return apiRepo.findAll();
    }

    public Product getProductById(int id) {
        return apiRepo.findById(id).orElse(null);
    }

    public Product getProductByName(String name) {
        return apiRepo.findByName(name);
    }

    // Post Methods
    public List<Product> addProducts(List<Product> products) {
        return apiRepo.saveAll(products);
    }

    public Product addProduct(Product product) {
        return apiRepo.save(product);
    }

    // delete methods
    public String deleteProduct(int id) {
        apiRepo.deleteById(id);
        return "Product deleted" + id;
    }

    // update methods
    public Product updateProduct(Product product) {
        Product existingProduct = apiRepo.findById(product.getId()).orElse(null);
        existingProduct.setId(product.getId());
        existingProduct.setName(product.getName());
        existingProduct.setQty(product.getQty());
        existingProduct.setPrice(product.getPrice());
        return apiRepo.save(existingProduct);

    }

}
